package fr.simpleblog.services;

public class MailingService {
	private String mail;
	private int port;
	private String smtpServer;
	private String login;
	private String password;

	public void sendMail() {
		throw new UnsupportedOperationException();
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return this.mail;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPort() {
		return this.port;
	}

	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	public String getSmtpServer() {
		return this.smtpServer;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return this.login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}
}