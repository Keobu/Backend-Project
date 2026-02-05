package Backend_project.ecommerce.Controller;

import Backend_project.ecommerce.entities.User;
import Backend_project.ecommerce.service.UserService;
import Backend_project.ecommerce.service.ImageUploadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final ImageUploadService imageUploadService;

    public UserController(UserService userService, ImageUploadService imageUploadService) {
        this.userService = userService;
        this.imageUploadService = imageUploadService;
    }

    @PatchMapping("/{id}/avatar")
    public ResponseEntity<User> updateAvatar(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {

        String imageUrl = imageUploadService.uploadImage(file);

        User updatedUser = userService.updateUserAvatar(id, imageUrl);

        return ResponseEntity.ok(updatedUser);
    }
}