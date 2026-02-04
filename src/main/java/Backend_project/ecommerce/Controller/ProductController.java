package Backend_project.ecommerce.Controller;

import Backend_project.ecommerce.entities.Product;
import Backend_project.ecommerce.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products") // Tutti gli indirizzi inizieranno con /api/products
public class ProductController {

    private final ProductRepository productRepository;

    // Iniettiamo il Bean del Repository tramite costruttore
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Metodo per leggere tutti i prodotti
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
