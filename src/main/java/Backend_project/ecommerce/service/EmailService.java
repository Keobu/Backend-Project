package Backend_project.ecommerce.service;

import kong.unirest.core.HttpResponse;
import kong.unirest.core.Unirest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Value("${resend.api.key}")
    private String apiKey;

    /**
     * Sends a welcome email to a new user.
     * @param toEmail The user's email address.
     * @param firstName The user's first name.
     */
    public void sendWelcomeEmail(String toEmail, String firstName) {

        String jsonBody = String.format(
                "{\"from\": \"onboarding@resend.dev\", \"to\": [\"%s\"], \"subject\": \"Welcome to our Store!\", \"html\": \"<h1>Hi %s!</h1><p>Your account has been created successfully. Welcome to the family!</p>\"}",
                toEmail, firstName
        );

        HttpResponse<String> response = Unirest.post("https://api.resend.com/emails")
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .body(jsonBody)
                .asString();

        if (response.isSuccess()) {
            System.out.println("Email sent successfully to: " + toEmail);
        } else {
            System.err.println("Failed to send email. Status: " + response.getStatus());
            System.err.println("Response Body: " + response.getBody());
        }
    }
}