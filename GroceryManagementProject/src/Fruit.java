import java.time.LocalDate;

public class Fruit extends Product implements interfaces {
    private String fruitType;
    private Boolean isOrganic;

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public Boolean getOrganic() {
        return isOrganic;
    }

    public void setOrganic(Boolean organic) {
        isOrganic = organic;
    }

    public Fruit(String fruitType, Boolean isOrganic) {
        this.fruitType = fruitType;
        this.isOrganic = isOrganic;
    }

    public Fruit() {super();};
    public Fruit(String name, Double price, Double weight, String origin, String typeOfSale, LocalDate productionDate, LocalDate expirationDate, Boolean requiresRefrigeration, NutritionalInfo contents, String fruitType, Boolean isOrganic) {
        super(name, price, weight, origin, typeOfSale, productionDate, expirationDate, requiresRefrigeration, contents);
        this.fruitType = fruitType;
        this.isOrganic = isOrganic;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitType='" + fruitType + '\'' +
                ", isOrganic=" + isOrganic +
                '}';
    }


}
