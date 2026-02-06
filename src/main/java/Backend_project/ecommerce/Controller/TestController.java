package Backend_project.ecommerce.Controller;

import com.resend.Resend;
import com.resend.services.emails.model.CreateEmailOptions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {


    private final String RESEND_API_KEY = "re_etL2AQzs_7RDE7gvi84dMR9SUEj4GPWEM";

    @PostMapping("/send-email")
    public ResponseEntity<?> sendManualEmail(@RequestBody Map<String, String> payload) {
        Resend resend = new Resend(RESEND_API_KEY);

        CreateEmailOptions params = CreateEmailOptions.builder()
                .from("onboarding@resend.dev")
                .to(payload.get("to"))
                .subject(payload.get("subject"))
                .html("<strong>" + payload.get("message") + "</strong>")
                .build();

        try {
            resend.emails().send(params);
            return ResponseEntity.ok(Map.of("status", "Email sent successfully!"));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error: " + e.getMessage());
        }
    }
}