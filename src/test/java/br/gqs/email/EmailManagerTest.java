package br.gqs.email;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class EmailManagerTest {
    @Test 
    public void shouldSendWelcomeEmail() {
        // Arrange - Preparar
        EmailService mockEmailService = 
          mock(EmailService.class);

        EmailManager emailManager = 
           new EmailManager(mockEmailService);

        // Action - Agir
        emailManager.sendWelcomeEmail(
            "dickvigarista@gmail.com");

        // Assert - Verificar
        verify(mockEmailService).
            sendEmail("dickvigarista@gmail.com", 
               "Welcome", "Hello");
    }

}