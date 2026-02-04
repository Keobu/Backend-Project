package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.Product;
import Backend_project.ecommerce.entities.Vendor;
import Backend_project.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByVendor(Vendor vendor);

    List<Product> findByCategory(Category category);

    List<Product> findByNameContainingIgnoreCase(String name);
}