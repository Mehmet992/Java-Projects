public class NutritionalInfo {
    private Double calories, protein, carbonhydrates, sugar, fat, saturatedFat, fiber;
    private Double calcium, sodium, iron;

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbonhydrates() {
        return carbonhydrates;
    }

    public void setCarbonhydrates(Double carbonhydrates) {
        this.carbonhydrates = carbonhydrates;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(Double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public Double getFiber() {
        return fiber;
    }

    public void setFiber(Double fiber) {
        this.fiber = fiber;
    }

    public Double getCalcium() {
        return calcium;
    }

    public void setCalcium(Double calcium) {
        this.calcium = calcium;
    }

    public Double getSodium() {
        return sodium;
    }

    public void setSodium(Double sodium) {
        this.sodium = sodium;
    }

    public Double getIron() {
        return iron;
    }

    public void setIron(Double iron) {
        this.iron = iron;
    }

    public NutritionalInfo() {};
    public NutritionalInfo(Double calories, Double protein, Double carbonhydrates, Double sugar, Double fat, Double saturatedFat, Double fiber, Double calcium, Double sodium, Double iron) {
        this.calories = calories;
        this.protein = protein;
        this.carbonhydrates = carbonhydrates;
        this.sugar = sugar;
        this.fat = fat;
        this.saturatedFat = saturatedFat;
        this.fiber = fiber;
        this.calcium = calcium;
        this.sodium = sodium;
        this.iron = iron;
    }
}
