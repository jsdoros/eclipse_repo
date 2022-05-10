package org.ssglobal.training.codes.threads;

public class TestMail {

	public static void main(String[] args) {
		Mail mail = new Mail();
		mail.setMessage("KILL BILL");

		MailSender mailer = new MailSender(mail);
		mailer.send();
		
		MailRecipient recipient = new MailRecipient(mail);
		recipient.receive();
	}

}
