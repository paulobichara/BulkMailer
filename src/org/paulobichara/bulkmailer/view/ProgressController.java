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

package org.paulobichara.bulkmailer.view;

import java.util.Collection;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

import org.paulobichara.bulkmailer.controller.EmailBuilder;
import org.paulobichara.bulkmailer.controller.EmailSender;
import org.paulobichara.bulkmailer.model.Email;
import org.paulobichara.bulkmailer.model.EmailProperties;

public class ProgressController extends Thread {

	private EmailProperties mailProps;
	private JProgressBar progressBar;
	private JTextPane log;
	
	public ProgressController(EmailProperties mailProps, JProgressBar barra, JTextPane log) {
		this.mailProps = mailProps;
		this.progressBar = barra;
		this.progressBar.setVisible(true);
		this.log = log;
	}
	
	@Override
	public void run() {
		EmailBuilder builder = new EmailBuilder();
		Collection<Email> emails = builder.montarEmails(mailProps);
		progressBar.setMaximum(emails.size());
		EmailSender.enviarEmail(emails, mailProps, this);
		JOptionPane.showMessageDialog(progressBar, "Envio concluído!");
	}
	
	public void incrementarBarraProgresso() {
		this.progressBar.setValue(progressBar.getValue()+1);
	}

	public void incrementarLog(String linha) {
		this.log.setText(log.getText() + linha);
	}
	
}
