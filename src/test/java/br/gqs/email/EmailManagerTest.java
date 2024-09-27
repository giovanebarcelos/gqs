package br.gqs.email;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class EmailManagerTest {
    @Test 
    public void shouldSendWelcomeEmail() {
        EmailService mockEmailService = 
          mock(EmailService.class);

        EmailManager emailManager = 
           new EmailManager(mockEmailService);

        emailManager.sendWelcomeEmail(
            "dickvigarista@gmail.com");

        verify(mockEmailService).
            sendEmail("dickvigarista@gmail.com", 
               "Welcome", "Hello");
    }

}