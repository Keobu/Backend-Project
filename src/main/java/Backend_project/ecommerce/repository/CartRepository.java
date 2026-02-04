package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.Cart;
import Backend_project.ecommerce.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    // Bean method per trovare il carrello associato a un cliente specifico
    Optional<Cart> findByCustomer(Customer customer);
}