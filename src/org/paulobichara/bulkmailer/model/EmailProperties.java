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
