package Backend_project.ecommerce.Controller;

import Backend_project.ecommerce.DTO.UserDTO;
import Backend_project.ecommerce.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    // Injecting the Service bean
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.findAllUsers();
    }
}