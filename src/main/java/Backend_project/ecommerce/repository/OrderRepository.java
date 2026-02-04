package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.Order;
import Backend_project.ecommerce.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomer(Customer customer);
}