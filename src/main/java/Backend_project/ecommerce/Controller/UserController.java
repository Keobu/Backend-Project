package Backend_project.ecommerce.Controller;

import Backend_project.ecommerce.service.ImageUploadService;
import Backend_project.ecommerce.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final ImageUploadService imageUploadService;
    private final UserService userService;

    public UserController(ImageUploadService imageUploadService, UserService userService) {
        this.imageUploadService = imageUploadService;
        this.userService = userService;
    }

    @PostMapping("/upload-profile-image")
    public ResponseEntity<?> uploadProfileImage(@RequestParam("file") MultipartFile file) {
        try {
            String email = SecurityContextHolder.getContext().getAuthentication().getName();

            Object result = imageUploadService.uploadImage(file);
            String imageUrl;

            if (result instanceof Map) {
                imageUrl = ((Map<?, ?>) result).get("url").toString();
            } else if (result instanceof String) {
                imageUrl = (String) result;
            } else {
                return ResponseEntity.badRequest().body("Unsupported upload response format");
            }

            userService.updateProfileImage(email, imageUrl);

            Map<String, String> response = new HashMap<>();
            response.put("message", "Profile image updated successfully");
            response.put("url", imageUrl);

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Upload failed: " + e.getMessage());
        }
    }
}