package Backend_project.ecommerce.service;

import Backend_project.ecommerce.entities.Order;
import Backend_project.ecommerce.entities.Customer;
import Backend_project.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Logic to list all orders for a specific customer
    public List<Order> getCustomerOrders(Customer customer) {
        return orderRepository.findByCustomer(customer);
    }

}