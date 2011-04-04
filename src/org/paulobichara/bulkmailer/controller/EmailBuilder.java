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

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import org.paulobichara.bulkmailer.model.Destinatario;
import org.paulobichara.bulkmailer.model.Email;
import org.paulobichara.bulkmailer.model.EmailProperties;

public class EmailBuilder {


	private static String getCorpoEmail(File emailHTML) {
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(emailHTML));
			while (scanner.hasNextLine()){
				text.append(scanner.nextLine() + NL);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			scanner.close();
		}
		return text.toString();
	}
	
	private static String getStringFormatado(String palavraComposta) {
		String nome = "";
		String[] nomeComposto = palavraComposta.toLowerCase().split(" ");
			for (int i = 0; i < nomeComposto.length; i++) {
				if (!nomeComposto[i].trim().equals("")) {
					if (!nome.equals("")) {
						nome = nome + " ";
					}
					nome = nome + nomeComposto[i].substring(0,1).toUpperCase() + nomeComposto[i].substring(1);
				}
			}		
		return nome;
	}
	
	private static Collection<Destinatario> getDestinatarios(File dadosEnvio) {
		Scanner scanner = null;
		Collection<Destinatario> destinatarios = new ArrayList<Destinatario>();
		try {
			scanner = new Scanner(new FileInputStream(dadosEnvio));
			while (scanner.hasNextLine()){
				String strDest = scanner.nextLine();
				Destinatario dest = new Destinatario();
				String nome = getStringFormatado(strDest.split(";")[0]);
				String sobrenome = getStringFormatado(strDest.split(";")[1]);
				String sexo = strDest.split(";")[2];
				String email = strDest.split(";")[3];
				dest.setEmail(email);
				dest.setNome(nome);
				dest.setSexo(sexo);
				dest.setSobrenome(sobrenome);
				destinatarios.add(dest);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			scanner.close();
		}
		return destinatarios;
	}
	
	
	public Collection<Email> montarEmails(EmailProperties mailProps) {
		Collection<Destinatario> destinatarios = getDestinatarios(mailProps.getDadosEnvio());
		String corpoBase = getCorpoEmail(mailProps.getEmailHTML());
		Iterator<Destinatario> itDest = destinatarios.iterator();
		Collection<Email> emails = new ArrayList<Email>();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String dataAtual = formatador.format(Calendar.getInstance().getTime());
		while (itDest.hasNext()) {
			Destinatario dest = itDest.next();
			Email email = new Email();
			email.setDestinatario(dest);
			email.setFrom(mailProps.getFrom());
			email.setStrMenData(dataAtual);
			email.setStrMenAssunto(mailProps.getAssunto());
			String corpoCustom = corpoBase.replace(mailProps.getMarcadorNome(), dest.getNome() + " " + dest.getSobrenome());
			email.setCorpo(corpoCustom);
			emails.add(email);
		}
		return emails;
	}

}
