package HW_OOP_1;

public class Coffee extends Product{
    private String coffeeType;
    private String milkType;

    public Coffee(String productName, double productPrice, Integer productVolume,  String milkType, String coffeeType) {
        super(productName, productPrice, productVolume);
        this.milkType = milkType;
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, Тип: %s, Молоко: %s", super.toString(), coffeeType, milkType);
    }
}