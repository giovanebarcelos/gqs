package br.gqs.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
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

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("lexluthor@gobyz.com",
                 "lexluthor");
            }
        });

        Message message = new MimeMessage(session);
        
        try {
            message.setFrom(new InternetAddress("lexluthor@gobyz.com"));
            
            message.setRecipients(Message.RecipientType.TO, 
            InternetAddress.parse(to));

            message.setSubject(subject);

            message.setText(body);
            
            Transport.send(message);

            System.out.println("Email enviado com sucesso para "+to+"!");
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}