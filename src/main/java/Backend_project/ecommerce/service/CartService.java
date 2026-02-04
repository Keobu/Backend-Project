package Backend_project.ecommerce.service;

import Backend_project.ecommerce.entities.Cart;
import Backend_project.ecommerce.entities.Customer;
import Backend_project.ecommerce.repository.CartRepository;
import Backend_project.ecommerce.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    // Business logic to get a cart by customer
    public Cart findCartByCustomer(Customer customer) {
        return cartRepository.findByCustomer(customer)
                .orElseThrow(() -> new ResourceNotFoundException("Cart not found for this customer"));
    }
}