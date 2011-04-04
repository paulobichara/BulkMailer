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


public class Email {

	private String corpo;
	private String from;
	private String strMenAssunto;
	private String strMenData;
	private Destinatario destinatario;

	public Email() {
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @param strMenAssunto the strMenAssunto to set
	 */
	public void setStrMenAssunto(String strMenAssunto) {
		this.strMenAssunto = strMenAssunto;
	}

	/**
	 * @return the strMenAssunto
	 */
	public String getStrMenAssunto() {
		return strMenAssunto;
	}

	/**
	 * @param strMenData the strMenData to set
	 */
	public void setStrMenData(String strMenData) {
		this.strMenData = strMenData;
	}

	/**
	 * @return the strMenData
	 */
	public String getStrMenData() {
		return strMenData;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	
}
