package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    // Custom query to find a vendor by their store name
    Optional<Vendor> findByStoreName(String storeName);
}