package Backend_project.ecommerce.service;

import Backend_project.ecommerce.entities.User;
import Backend_project.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User updateUserAvatar(Long id, String imageUrl) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        user.setProfileImage(imageUrl);

        return userRepository.save(user);
    }
}