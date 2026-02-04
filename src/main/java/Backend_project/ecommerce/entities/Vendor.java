package Backend_project.ecommerce.entities;

import jakarta.persistence.*;

@Entity
public class Vendor extends User {
    private String vatNumber; // Partita IVA

    public Vendor() {
        super();
    }

    public String getVatNumber() { return vatNumber; }
    public void setVatNumber(String vatNumber) { this.vatNumber = vatNumber; }
}