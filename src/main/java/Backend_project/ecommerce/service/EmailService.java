package Backend_project.ecommerce.service;

import com.resend.*;
import com.resend.core.exception.ResendException;
import com.resend.services.emails.model.CreateEmailOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Value("${resend.api.key}")
    private String resendApiKey;

    public void sendEmail(String to, String subject, String content) {

        Resend resend = new Resend(resendApiKey);

        CreateEmailOptions params = CreateEmailOptions.builder()
                .from("onboarding@resend.dev")
                .to(to)
                .subject(subject)
                .html("<strong>" + content + "</strong>")
                .build();

        try {

            resend.emails().send(params);
            System.out.println("Email sent successfully to: " + to);
        } catch (ResendException e) {

            System.err.println("Resend SDK error: " + e.getMessage());
        } catch (Exception e) {

            System.err.println("General email service error: " + e.getMessage());
        }
    }
}