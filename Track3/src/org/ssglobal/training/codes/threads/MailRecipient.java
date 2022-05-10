package org.ssglobal.training.codes.threads;

public class MailRecipient {

	private Mail mail;

	public MailRecipient(Mail mail) {
		this.mail = mail;
	}
	
	public void receive() {
		synchronized(mail) {
			mail.notifyAll();
			System.out.println("I have waited. Mail is here");
			System.out.format("Message: %s. \n", mail.getMessage());
		}
	}
}
