package org.ssglobal.training.codes.threads;

public class MailSender {

	private Mail mail;
	
	public MailSender(Mail mail) {
		this.mail = mail;
	}
	
	public void send() {
		synchronized(mail) {
			System.out.println("Sending the mail......");
			
			try {
				mail.wait(5000);
				
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
