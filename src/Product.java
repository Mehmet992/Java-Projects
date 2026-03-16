import java.time.LocalDate;

public class Product {
    private String name;
    private Double price;
    private Double weight;
    private String origin;
    private String typeOfSale; //Per kg, per liter etc.
    private LocalDate productionDate;
    private LocalDate expirationDate;
    private Boolean requiresRefrigeration;
    private NutritionalInfo contents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTypeOfSale() {
        return typeOfSale;
    }

    public void setTypeOfSale(String typeOfSale) {
        this.typeOfSale = typeOfSale;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getRequiresRefrigeration() {
        return requiresRefrigeration;
    }

    public void setRequiresRefrigeration(Boolean requiresRefrigeration) {
        this.requiresRefrigeration = requiresRefrigeration;
    }

    public NutritionalInfo getContents() {
        return contents;
    }

    public void setContents(NutritionalInfo contents) {
        this.contents = contents;
    }

    public Product() {};
    public Product(String name, Double price, Double weight, String origin, String typeOfSale, LocalDate productionDate, LocalDate expirationDate, Boolean requiresRefrigeration, NutritionalInfo contents) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.origin = origin;
        this.typeOfSale = typeOfSale;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "";
    }

    public double calculateShelfLife() {
        return 0.0;
    }
}
