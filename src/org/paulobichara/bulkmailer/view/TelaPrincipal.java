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


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.paulobichara.bulkmailer.controller.EmailSender;
import org.paulobichara.bulkmailer.model.EmailProperties;
public class TelaPrincipal {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="139,-14"
	private JPanel jContentPane = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel tabConexao = null;
	private JPanel tabInicio = null;
	private JPanel jPanel21 = null;
	private JLabel jLabel = null;
	private JTextField fieldServer = null;
	private JLabel jLabel1 = null;
	private JCheckBox checkAuth = null;
	private JLabel labelLogin = null;
	private JTextField fieldLogin = null;
	private JLabel labelPassword = null;
	private JTextField fieldPassword = null;
	private JButton buttonTestar = null;
	private JPanel jPanel3 = null;
	private JLabel jLabel3 = null;
	private JTextField fieldPorta = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField fieldFrom = null;
	private JTextField fieldNome = null;
	private JTextField fieldAssunto = null;
	private JButton buttonContinuar = null;
	private JLabel jLabel7 = null;
	private JPanel jPanel2 = null;
	private JButton buttonIniciar = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JPanel tabDados = null;
	private JPanel jPanel5 = null;
	private JLabel jLabel11 = null;
	private JTextField fieldCorpo = null;
	private JButton buttonCorpo = null;
	private JPanel jPanel6 = null;
	private JButton buttonEnviar = null;
	private JLabel jLabel12 = null;
	private JTextField fieldDestinatarios = null;
	private JButton btDestinatarios = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JTextField fieldMarcador = null;
	private JLabel jLabel15 = null;

	private EmailProperties mailProps = new EmailProperties();  //  @jve:decl-index=0:
	private JPanel tabProgresso = null;
	private JPanel jPanel1 = null;
	private JProgressBar jProgressBar = null;
	private JPanel jPanel4 = null;
	private JButton buttonEncerrar = null;
	private JTextPane textPaneLog = null;
	private JScrollPane jScrollPane = null;
	/**
	 * This method initializes jFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setSize(new Dimension(54, 56));
			jFrame.setTitle("Central BulkMailer");
			jFrame.setResizable(false);
	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setPreferredSize(new Dimension(529, 488));
			jFrame.setMinimumSize(new Dimension(529, 488));
			jFrame.setMaximumSize(new Dimension(529, 488));
			jFrame.setContentPane(getJContentPane());
			jFrame.setLocationRelativeTo(null);		
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			jContentPane.setSize(new Dimension(524, 488));
			jContentPane.add(getJTabbedPane(), BorderLayout.NORTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setPreferredSize(new Dimension(80, 455));
			jTabbedPane.addTab("Início", null, getTabInicio(), null);
			jTabbedPane.addTab("Conexão", null, getTabConexao(), null);
			jTabbedPane.addTab("Dados de Envio", null, getTabDados(), null);
			jTabbedPane.addTab("Progresso do Envio", null, getTabProgresso(), null);
			jTabbedPane.setEnabledAt(0, true);
			jTabbedPane.setEnabledAt(1, false);
			jTabbedPane.setEnabledAt(2, false);
			jTabbedPane.setEnabledAt(3, false);			
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes tabConexao	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getTabConexao() {
		if (tabConexao == null) {
			tabConexao = new JPanel();
			tabConexao.setLayout(null);
			tabConexao.setName("tabConexao");
			tabConexao.setPreferredSize(new Dimension(40, 160));
			tabConexao.setEnabled(true);
			tabConexao.setVisible(true);
			tabConexao.add(getJPanel21(), null);
			tabConexao.add(getJPanel3(), null);
			tabConexao.add(getButtonContinuar(), null);
		}
		return tabConexao;
	}

	/**
	 * This method initializes tabInicio	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getTabInicio() {
		if (tabInicio == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("Bem-Vindo ao Central BulkMailer!");
			jLabel7.setBackground(new Color(178, 180, 255));
			jLabel7.setBounds(new Rectangle(85, 10, 315, 22));
			jLabel7.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 18));
			tabInicio = new JPanel();
			tabInicio.setLayout(null);
			tabInicio.setName("tabInicio");
			tabInicio.add(getJPanel2(), null);
			tabInicio.add(getButtonIniciar(), null);
			tabInicio.add(jLabel10, null);
		}
		return tabInicio;
	}

	/**
	 * This method initializes jPanel21	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel21() {
		if (jPanel21 == null) {
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(356, 69, 37, 28));
			jLabel3.setText("Porta:");
			labelPassword = new JLabel();
			labelPassword.setBounds(new Rectangle(16, 108, 88, 28));
			labelPassword.setEnabled(false);
			labelPassword.setName("labelPassword");
			labelPassword.setText("Password:");
			labelLogin = new JLabel();
			labelLogin.setBounds(new Rectangle(16, 71, 88, 24));
			labelLogin.setEnabled(false);
			labelLogin.setName("labelLogin");
			labelLogin.setText("Login:");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(349, 30, 129, 27));
			jLabel1.setText("Requer Autenticação");
			jLabel = new JLabel();
			jLabel.setText("SMTP Server:");
			jLabel.setBounds(new Rectangle(16, 29, 97, 24));
			jPanel21 = new JPanel();
			jPanel21.setLayout(null);
			jPanel21.setPreferredSize(new Dimension(40, 150));
			jPanel21.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "SMTP", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 12), SystemColor.activeCaption));
			jPanel21.setBounds(new Rectangle(9, 14, 491, 157));
			jPanel21.add(jLabel, null);
			jPanel21.add(getFieldServer(), null);
			jPanel21.add(jLabel1, null);
			jPanel21.add(getCheckAuth(), null);
			jPanel21.add(labelLogin, null);
			jPanel21.add(getFieldLogin(), null);
			jPanel21.add(labelPassword, null);
			jPanel21.add(getFieldPassword(), null);
			jPanel21.add(getButtonTestar(), null);
			jPanel21.add(jLabel3, null);
			jPanel21.add(getFieldPorta(), null);
		}
		return jPanel21;
	}

	/**
	 * This method initializes fieldServer	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldServer() {
		if (fieldServer == null) {
			fieldServer = new JTextField();
			fieldServer.setBounds(new Rectangle(118, 31, 198, 25));
			fieldServer.setName("fieldServer");
			fieldServer.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					buttonContinuar.setEnabled(false);
				}
			});
		}
		return fieldServer;
	}

	/**
	 * This method initializes checkAuth	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getCheckAuth() {
		if (checkAuth == null) {
			checkAuth = new JCheckBox();
			checkAuth.setBounds(new Rectangle(327, 32, 21, 21));
			checkAuth.setName("checkAuth");
			checkAuth.setText("");
			checkAuth.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					buttonContinuar.setEnabled(false);
					if (checkAuth.isSelected()) {
						labelLogin.setEnabled(true);
						labelPassword.setEnabled(true);
						fieldLogin.setEnabled(true);
						fieldPassword.setEnabled(true);
					} else {
						labelLogin.setEnabled(false);
						labelPassword.setEnabled(false);
						fieldLogin.setEnabled(false);
						fieldPassword.setEnabled(false);						
					}
				}
			});
		}
		return checkAuth;
	}

	/**
	 * This method initializes fieldLogin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldLogin() {
		if (fieldLogin == null) {
			fieldLogin = new JTextField();
			fieldLogin.setBounds(new Rectangle(119, 69, 197, 27));
			fieldLogin.setEnabled(false);
			fieldLogin.setName("fieldLogin");
			fieldLogin.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					buttonContinuar.setEnabled(false);
				}
			});
		}
		return fieldLogin;
	}

	/**
	 * This method initializes fieldPassword	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldPassword() {
		if (fieldPassword == null) {
			fieldPassword = new JPasswordField();
			fieldPassword.setBounds(new Rectangle(119, 109, 197, 26));
			fieldPassword.setEnabled(false);
			fieldPassword.setName("fieldPassword");
			fieldPassword.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					buttonContinuar.setEnabled(false);
				}
			});
		}
		return fieldPassword;
	}

	/**
	 * This method initializes buttonTestar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonTestar() {
		if (buttonTestar == null) {
			buttonTestar = new JButton();
			buttonTestar.setBounds(new Rectangle(335, 107, 137, 32));
			buttonTestar.setName("buttonTestar");
			buttonTestar.setText("Testar Conexão");
			buttonTestar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					boolean requerAuth = checkAuth.isSelected();
					boolean erro = false;
					String login = fieldLogin.getText();
					String password = fieldPassword.getText();
					String server = fieldServer.getText();
					String porta = fieldPorta.getText();
					mailProps.setRequerAutenticacao(requerAuth);
					if (server.equals("") || porta.equals("")) {
						JOptionPane.showMessageDialog(tabConexao, "O servidor e a porta devem ser informados!");
						erro = true;
					} else {
						Integer port = null;
						try {
							port = Integer.valueOf(porta);
							mailProps.setPort(port);
						} catch (Exception ex) {
							JOptionPane.showMessageDialog(tabConexao, "Porta inválida!");
							erro = true;
						}
						if (!erro && requerAuth) {
							if (login.equals("") || password.equals("")) {
								JOptionPane.showMessageDialog(tabConexao, "O login e o password devem ser informados!");
								erro = true;
							} else {
								mailProps.setUsername(login);
								mailProps.setPassword(password);
							}
						}
						if (!erro) {
							mailProps.setServer(server);
							mailProps.setPort(Integer.valueOf(porta));
							boolean sucesso = EmailSender.testarConexao(mailProps);
							if (sucesso) {
								JOptionPane.showMessageDialog(tabConexao, "A conexão foi estabelecida com sucesso!");
								buttonContinuar.setEnabled(true);
							} else {
								JOptionPane.showMessageDialog(tabConexao, "Ocorreram erros no estabelecimento da conexão! Verifique os dados informados ou a sua conectividade com a internet!");								
							}
						}
					}
				}
			});
		}
		return buttonTestar;
	}

	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(16, 106, 61, 28));
			jLabel6.setText("Assunto:");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(16, 69, 60, 26));
			jLabel5.setText("Nome:");
			jLabel4 = new JLabel();
			jLabel4.setText("From:");
			jLabel4.setBounds(new Rectangle(15, 29, 61, 28));
			jPanel3 = new JPanel();
			jPanel3.setLayout(null);
			jPanel3.setBounds(new Rectangle(9, 189, 490, 162));
			jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Email", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 12), SystemColor.activeCaption));
			jPanel3.add(jLabel4, null);
			jPanel3.add(jLabel5, null);
			jPanel3.add(jLabel6, null);
			jPanel3.add(getFieldFrom(), null);
			jPanel3.add(getFieldNome(), null);
			jPanel3.add(getFieldAssunto(), null);
		}
		return jPanel3;
	}

	/**
	 * This method initializes fieldPorta	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldPorta() {
		if (fieldPorta == null) {
			fieldPorta = new JTextField();
			fieldPorta.setBounds(new Rectangle(399, 72, 59, 24));
			fieldPorta.setText("25");
			fieldPorta.setName("fieldPorta");
			fieldPorta.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					buttonContinuar.setEnabled(false);
				}
			});
		}
		return fieldPorta;
	}

	/**
	 * This method initializes fieldFrom	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldFrom() {
		if (fieldFrom == null) {
			fieldFrom = new JTextField();
			fieldFrom.setBounds(new Rectangle(86, 30, 383, 27));
			fieldFrom.setName("fieldFrom");
		}
		return fieldFrom;
	}

	/**
	 * This method initializes fieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldNome() {
		if (fieldNome == null) {
			fieldNome = new JTextField();
			fieldNome.setBounds(new Rectangle(86, 69, 383, 27));
			fieldNome.setName("fieldNome");
		}
		return fieldNome;
	}

	/**
	 * This method initializes fieldAssunto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldAssunto() {
		if (fieldAssunto == null) {
			fieldAssunto = new JTextField();
			fieldAssunto.setBounds(new Rectangle(87, 107, 382, 26));
			fieldAssunto.setName("fieldAssunto");
		}
		return fieldAssunto;
	}

	/**
	 * This method initializes buttonContinuar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonContinuar() {
		if (buttonContinuar == null) {
			buttonContinuar = new JButton();
			buttonContinuar.setBounds(new Rectangle(158, 377, 194, 30));
			buttonContinuar.setName("buttonContinuar");
			buttonContinuar.setEnabled(false);
			buttonContinuar.setText("Continuar");
			buttonContinuar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String from = fieldFrom.getText();
					String assunto = fieldAssunto.getText();
					mailProps.setFrom(from);
					mailProps.setAssunto(assunto);
					jTabbedPane.setEnabledAt(1, false);
					jTabbedPane.setEnabledAt(2, true);
					jTabbedPane.setSelectedIndex(2);
				}
			});
		}
		return buttonContinuar;
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("Para iniciar a configuração desta sessão, clique no botão abaixo:");
			jLabel10.setBounds(new Rectangle(52, 356, 405, 19));
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(36, 45, 413, 20));
			jLabel9.setText("O Central BulkMailer é um aplicativo de envio massivo de emails.");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(121, 73, 235, 236));
			jLabel8.setText("");
			jLabel8.setIcon(new ImageIcon(getClass().getResource("/resources/images/logo.png")));
			jPanel2 = new JPanel();
			jPanel2.setLayout(null);
			jPanel2.setBounds(new Rectangle(18, 15, 476, 333));
			jPanel2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
			jPanel2.setBackground(SystemColor.controlHighlight);
			jPanel2.add(jLabel8, null);
			jPanel2.add(jLabel9, null);
			jPanel2.add(jLabel7, null);
		}
		return jPanel2;
	}

	/**
	 * This method initializes buttonIniciar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonIniciar() {
		if (buttonIniciar == null) {
			buttonIniciar = new JButton();
			buttonIniciar.setText("Iniciar Configuração");
			buttonIniciar.setName("buttonIniciar");
			buttonIniciar.setBounds(new Rectangle(152, 386, 217, 28));
			buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTabbedPane.setEnabledAt(0, false);
					jTabbedPane.setEnabledAt(1, true);
					jTabbedPane.setSelectedIndex(1);
				}
			});
		}
		return buttonIniciar;
	}

	/**
	 * This method initializes tabDados	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getTabDados() {
		if (tabDados == null) {
			tabDados = new JPanel();
			tabDados.setLayout(null);
			tabDados.setEnabled(false);
			tabDados.setName("tabDados");
			tabDados.add(getJPanel5(), null);
			tabDados.add(getJPanel6(), null);
			tabDados.add(getButtonEnviar(), null);
		}
		return tabDados;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(387, 98, 68, 23));
			jLabel15.setForeground(SystemColor.activeCaption);
			jLabel15.setText("ex: {NOME}");
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(11, 96, 126, 27));
			jLabel14.setText("Marcador do Nome:");
			jLabel11 = new JLabel();
			jLabel11.setText("Arquivo (HTML):");
			jLabel11.setBounds(new Rectangle(11, 36, 125, 29));
			jPanel5 = new JPanel();
			jPanel5.setLayout(null);
			jPanel5.setBounds(new Rectangle(12, 15, 483, 154));
			jPanel5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Corpo do Email", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 12), SystemColor.activeCaption));
			jPanel5.add(jLabel11, null);
			jPanel5.add(getFieldCorpo(), null);
			jPanel5.add(getButtonCorpo(), null);
			jPanel5.add(jLabel14, null);
			jPanel5.add(getFieldMarcador(), null);
			jPanel5.add(jLabel15, null);
		}
		return jPanel5;
	}

	/**
	 * This method initializes fieldCorpo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldCorpo() {
		if (fieldCorpo == null) {
			fieldCorpo = new JTextField();
			fieldCorpo.setBounds(new Rectangle(145, 37, 226, 27));
			fieldCorpo.setEditable(false);
			fieldCorpo.setName("fieldCorpo");
		}
		return fieldCorpo;
	}

	/**
	 * This method initializes buttonCorpo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonCorpo() {
		if (buttonCorpo == null) {
			buttonCorpo = new JButton();
			buttonCorpo.setBounds(new Rectangle(369, 37, 97, 26));
			buttonCorpo.setName("buttonCorpo");
			buttonCorpo.setText("Selecionar");
			buttonCorpo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.addChoosableFileFilter(new HtmlFilter());
					fileChooser.setAcceptAllFileFilterUsed(false);
					int result = fileChooser.showOpenDialog(tabDados);
					if (result == JFileChooser.APPROVE_OPTION) {
						File fileHTML = fileChooser.getSelectedFile();
						fieldCorpo.setText(fileHTML.getAbsolutePath());
						mailProps.setEmailHTML(fileHTML);
					}
					
				}
			});
		}
		return buttonCorpo;
	}

	/**
	 * This method initializes jPanel6	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(12, 86, 459, 19));
			jLabel13.setFont(new Font("Dialog", Font.BOLD, 11));
			jLabel13.setForeground(SystemColor.activeCaption);
			jLabel13.setText("** ATENÇÃO: o arquivo deve possuir o formato NOME ; SOBRENOME ; EMAIL");
			jLabel12 = new JLabel();
			jLabel12.setText("Destinatários (CSV):");
			jLabel12.setBounds(new Rectangle(11, 48, 127, 29));
			jPanel6 = new JPanel();
			jPanel6.setLayout(null);
			jPanel6.setBounds(new Rectangle(13, 192, 482, 161));
			jPanel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Destinatários", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 12), SystemColor.activeCaption));
			jPanel6.add(jLabel12, null);
			jPanel6.add(getFieldDestinatarios(), null);
			jPanel6.add(getBtDestinatarios(), null);
			jPanel6.add(jLabel13, null);
		}
		return jPanel6;
	}

	/**
	 * This method initializes buttonEnviar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonEnviar() {
		if (buttonEnviar == null) {
			buttonEnviar = new JButton();
			buttonEnviar.setBounds(new Rectangle(171, 377, 161, 34));
			buttonEnviar.setName("buttonEnviar");
			buttonEnviar.setText("Enviar Emails");
			buttonEnviar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String marcador = fieldMarcador.getText();
					mailProps.setMarcadorNome(marcador);
					jTabbedPane.setEnabledAt(2, false);
					jTabbedPane.setEnabledAt(3, true);
					jTabbedPane.setSelectedIndex(3);			
					ProgressController progress = new ProgressController(mailProps, jProgressBar, textPaneLog);
					progress.start();
				}
			});
		}
		return buttonEnviar;
	}

	/**
	 * This method initializes fieldDestinatarios	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldDestinatarios() {
		if (fieldDestinatarios == null) {
			fieldDestinatarios = new JTextField();
			fieldDestinatarios.setBounds(new Rectangle(145, 50, 225, 27));
			fieldDestinatarios.setEditable(false);
			fieldDestinatarios.setName("fieldDestinatarios");
		}
		return fieldDestinatarios;
	}

	/**
	 * This method initializes btDestinatarios	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtDestinatarios() {
		if (btDestinatarios == null) {
			btDestinatarios = new JButton();
			btDestinatarios.setBounds(new Rectangle(368, 50, 97, 26));
			btDestinatarios.setName("btDestinatarios");
			btDestinatarios.setText("Selecionar");
			btDestinatarios.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.addChoosableFileFilter(new CSVFilter());
					fileChooser.setAcceptAllFileFilterUsed(false);
					int result = fileChooser.showOpenDialog(tabDados);
					if (result == JFileChooser.APPROVE_OPTION) {
						File fileCSV = fileChooser.getSelectedFile();
						fieldDestinatarios.setText(fileCSV.getAbsolutePath());
						mailProps.setDadosEnvio(fileCSV);
					}
				}
			});
		}
		return btDestinatarios;
	}

	/**
	 * This method initializes fieldMarcador	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getFieldMarcador() {
		if (fieldMarcador == null) {
			fieldMarcador = new JTextField();
			fieldMarcador.setBounds(new Rectangle(145, 97, 226, 26));
			fieldMarcador.setName("fieldMarcador");
			fieldMarcador.setToolTipText("Marcação no corpo do email onde o nome de cada destinatário será posicionado");
		}
		return fieldMarcador;
	}
	
	/**
	 * This method initializes tabProgresso	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getTabProgresso() {
		if (tabProgresso == null) {
			tabProgresso = new JPanel();
			tabProgresso.setLayout(null);
			tabProgresso.add(getJPanel1(), null);
			tabProgresso.add(getJPanel4(), null);
			tabProgresso.add(getButtonEncerrar(), null);
		}
		return tabProgresso;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(11, 13, 484, 93));
			jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Progresso", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.PLAIN, 12), SystemColor.activeCaption));
			jPanel1.add(getJProgressBar(), null);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jProgressBar	
	 * 	
	 * @return javax.swing.JProgressBar	
	 */
	private JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
			jProgressBar.setBounds(new Rectangle(18, 39, 450, 28));
			jProgressBar.setBackground(SystemColor.control);
			jProgressBar.setVisible(false);
		}
		return jProgressBar;
	}

	/**
	 * This method initializes jPanel4	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(null);
			jPanel4.setBounds(new Rectangle(11, 119, 485, 238));
			jPanel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Log", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.PLAIN, 12), SystemColor.activeCaption));
			jPanel4.add(getJScrollPane(), null);
		}
		return jPanel4;
	}

	/**
	 * This method initializes buttonEncerrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButtonEncerrar() {
		if (buttonEncerrar == null) {
			buttonEncerrar = new JButton();
			buttonEncerrar.setBounds(new Rectangle(170, 376, 170, 35));
			buttonEncerrar.setEnabled(true);
			buttonEncerrar.setText("Encerrar");
			buttonEncerrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});			
		}
		return buttonEncerrar;
	}

	/**
	 * This method initializes textPaneLog	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getTextPaneLog() {
		if (textPaneLog == null) {
		textPaneLog = new JTextPane();
			textPaneLog.setBounds(new Rectangle(23, 29, 417, 190));
		}
		return textPaneLog;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane(getTextPaneLog());
			jScrollPane.setBounds(new Rectangle(18, 25, 450, 194));
			jScrollPane.setViewportView(getTextPaneLog());
			jScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
		        public void adjustmentValueChanged(AdjustmentEvent e) {  
		            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
		        }
		    });
			
		}
		return jScrollPane;
	}


	public static void main(String[] args) {
		try {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	    			TelaPrincipal tela = new TelaPrincipal();
	            	tela.getJFrame().pack();
	            	tela.getJFrame().setVisible(true);
	            }
	        });			
		}catch (Exception e){};
	}		
}
