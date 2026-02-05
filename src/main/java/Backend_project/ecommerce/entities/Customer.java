package Backend_project.ecommerce.entities;

import jakarta.persistence.*;

@Entity
public class Customer extends User {
    private String shippingAddress;

    public Customer() {
        super();
        this.setRole(Role.CUSTOMER);
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
}
