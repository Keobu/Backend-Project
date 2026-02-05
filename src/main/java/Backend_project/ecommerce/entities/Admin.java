package Backend_project.ecommerce.entities;

import jakarta.persistence.*;

@Entity
public class Admin extends User {
    private String adminLevel;

    public Admin() {
        super();
        this.setRole(Role.ADMIN);
    }

    public String getAdminLevel() { return adminLevel; }
    public void setAdminLevel(String adminLevel) { this.adminLevel = adminLevel; }
}