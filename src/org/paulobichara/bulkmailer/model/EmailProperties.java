package org.paulobichara.bulkmailer.model;

import java.io.File;


public class EmailProperties {

	private String username;
	private String password;
	private String server;
	private String from;
	private int port;
	private File emailHTML;
	private File dadosEnvio;
	private String assunto;
	private boolean requerAutenticacao;
	private String marcadorNome;
	
	public EmailProperties() {
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getServer() {
		return server;
	}

	public String getFrom() {
		return from;
	}

	public int getPort() {
		return port;
	}

	public void setEmailHTML(File emailHTML) {
		this.emailHTML = emailHTML;
	}

	public File getEmailHTML() {
		return emailHTML;
	}

	public void setDadosEnvio(File dadosEnvio) {
		this.dadosEnvio = dadosEnvio;
	}

	public File getDadosEnvio() {
		return dadosEnvio;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setRequerAutenticacao(boolean requerAutenticacao) {
		this.requerAutenticacao = requerAutenticacao;
	}

	public boolean requerAutenticacao() {
		return requerAutenticacao;
	}

	public boolean isRequerAutenticacao() {
		return requerAutenticacao;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setMarcadorNome(String marcadorNome) {
		this.marcadorNome = marcadorNome;
	}

	public String getMarcadorNome() {
		return marcadorNome;
	}
	
}
