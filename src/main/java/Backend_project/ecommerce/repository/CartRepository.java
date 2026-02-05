package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.Cart;
import Backend_project.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByUser(User user);
}