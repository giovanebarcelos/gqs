package br.gqs.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

class EmailServiceUtil implements EmailService {

    @Override
    public void sendEmail(String to, String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gobyz.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, 
            new Authenticator() {            
             protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
                "lexluthor@gobyz.com", "lexluthor");
            }});

        Message message = new MimeMessage(session);
    }
}