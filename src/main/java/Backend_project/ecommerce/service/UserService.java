package Backend_project.ecommerce.service;

import Backend_project.ecommerce.entities.User;
import Backend_project.ecommerce.repository.UserRepository;
import Backend_project.ecommerce.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + email));
    }


    @Transactional
    public void updateProfileImage(String email, String imageUrl) {
        User user = findByEmail(email);
        user.setProfileImage(imageUrl);
        userRepository.save(user);
    }
}