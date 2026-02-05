package Backend_project.ecommerce.entities;

import jakarta.persistence.*;

@Entity
public class Vendor extends User {
    private String vatNumber;
    private String storeName;

    public Vendor() {
        super();
        this.setRole(Role.VENDOR);
    }

    // Standard getters and setters for database mapping
    public String getVatNumber() { return vatNumber; }
    public void setVatNumber(String vatNumber) { this.vatNumber = vatNumber; }
    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
}