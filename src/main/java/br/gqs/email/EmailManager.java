package br.gqs.email;

public class EmailManager {
    private EmailService emailService;

    public EmailManager(EmailService emailService) {
        this.emailService = emailService;
	}

	public void sendWelcomeEmail( String emailAddress){
        this.emailService.sendEmail(emailAddress, "Welcome", "Hello"); 

    }

}