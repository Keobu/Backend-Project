package Backend_project.ecommerce.DTO;

public class VendorDTO extends UserDTO {
    private String vatNumber;
    private String storeName;

    public VendorDTO() {
        super();
    }

    public String getVatNumber() { return vatNumber; }
    public void setVatNumber(String vatNumber) { this.vatNumber = vatNumber; }

    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
}