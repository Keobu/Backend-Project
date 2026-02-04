package Backend_project.ecommerce.repository;

import Backend_project.ecommerce.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface VendorRepositories extends JpaRepository<Vendor, Long> {
    Optional<Vendor> findByName(String name);
}
