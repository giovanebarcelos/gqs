package br.gqs.email;

public class SendEmail {
    public static void main(String[] args) {
        EmailServiceUtil emailUtl = new EmailServiceUtil();

        String[] emailTo = { "giovane.barcelos@gobyz.com","pedrohernandez1903@gmail.com", "alerafainer@hotmail.com", "mdg2503@gmail.com",
                "glrebes@gmail.com", "joaorqn@gmail.com", "bryszymczak@gmail.com", "gabrieltorbes@gmail.com",
                "brunovelaski96@gmail.com", "luigivibias11@gmail.com", "guilhermevianafilgueiras@gmail.com" };

        for (String to: emailTo){
            emailUtl.sendEmail(to, "Email de Teste", "Isto é um e-mail de teste");
        }
    }
}