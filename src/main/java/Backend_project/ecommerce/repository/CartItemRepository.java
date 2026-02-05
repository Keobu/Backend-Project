package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.CartItem;
import Backend_project.ecommerce.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    List<CartItem> findByCart(Cart cart);
}