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
