/*
   Copyright 2011 Paulo Augusto Dacach Bichara

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */

package org.paulobichara.bulkmailer.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.paulobichara.bulkmailer.model.Email;
import org.paulobichara.bulkmailer.model.EmailProperties;
import org.paulobichara.bulkmailer.view.ProgressController;

public class EmailSender {


	public static void enviarEmail(Collection<Email> emails, EmailProperties mailProps, ProgressController controlador) {
		Session session = null;
		Transport transport = null;
		int numErros = -1;
		Properties props = new Properties();
		session = Session.getInstance(props, null);
		session.getProperties().put("mail.smtp.host", mailProps.getServer());
		session.getProperties().put("mail.smtp.port", mailProps.getPort());
		session.getProperties().put("mail.smtp.auth", "false");
		while (numErros != 0) {
			try {
				transport = session.getTransport("smtp");
				numErros = 0;
			} catch (NoSuchProviderException e) {
				e.printStackTrace();
				numErros = 1;
			}
			try {
				if (mailProps.requerAutenticacao()) {
					transport.connect(mailProps.getUsername(),mailProps.getPassword());
				} else {
					transport.connect();
				}
			} catch (MessagingException e) {
				controlador.incrementarLog("Erro ao tentar conectar ao servidor SMTP - Tentando novamente...\n");
				numErros++;
				try {
					transport.close();
				} catch (MessagingException e1) {
					e1.printStackTrace();
				}
			}
		}
		Iterator<Email> itEmails = emails.iterator();
		while (itEmails.hasNext()) {
			Email email = itEmails.next();
			Message message = new MimeMessage(((Session)session));
			try {
				message.setFrom(new InternetAddress(email.getFrom()));
			} catch (AddressException e) {
				controlador.incrementarLog("Email FROM Inválido: " + email.getFrom() + "\n");
			} catch (MessagingException e) {
			}
			InternetAddress to[] = new InternetAddress[1];
			try {
				to[0] = new InternetAddress(email.getDestinatario().getEmail());
				message.setRecipients(Message.RecipientType.TO, to);
				message.setSubject(email.getStrMenAssunto());
				message.setContent(email.getCorpo(),"text/html");
				transport.sendMessage(message, to);
				controlador.incrementarLog("EMAIL ENVIADO PARA " + email.getDestinatario().getEmail() + "\n");
			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				controlador.incrementarLog("Erro ao formatar/enviar email" + "\n");
				while (!transport.isConnected()) {
					try {
						if (mailProps.requerAutenticacao()) {
							transport.connect(mailProps.getUsername(),mailProps.getPassword());
						} else {
							transport.connect();
						}
					} catch (Exception ex) {}
				}
				try {
					transport.sendMessage(message, to);
				} catch (MessagingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (Exception e) {
				controlador.incrementarLog("Erro ao enviar msg!" + "\n");
			}
			controlador.incrementarBarraProgresso();
		}
		controlador.incrementarLog("\n");
		try {
			transport.close();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}	

	public static boolean testarConexao(EmailProperties mailProps) {
		Session session = null;
		Transport transport = null;		
		Properties props = new Properties();
		session = Session.getInstance(props, null);
		session.getProperties().put("mail.smtp.host", mailProps.getServer());
		session.getProperties().put("mail.smtp.port", mailProps.getPort());
		
		if (mailProps.requerAutenticacao()) {
			session.getProperties().put("mail.smtp.auth", "true");
			session.getProperties().put("mail.smtp.auth", "true");			
		} else {
			session.getProperties().put("mail.smtp.auth", "false");			
		}
		
		try {
			transport = session.getTransport("smtp");
		} catch (NoSuchProviderException e) {
			return false;
		}
		
		try {
			if (mailProps.requerAutenticacao()) {
				transport.connect(mailProps.getUsername(),mailProps.getPassword());
			} else {
				transport.connect();
			}
			transport.close();
			return true;
		} catch (MessagingException e1) {
			e1.printStackTrace();
		}
		
		return false;
	}


}
