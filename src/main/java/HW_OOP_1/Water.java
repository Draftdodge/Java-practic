package HW_OOP_1;

public class Water extends Product{
    private Integer waterTemperature;

    public Water(String productName, double productPrice, Integer productVolume, Integer waterTemperature) {
        super(productName, productPrice, productVolume);
        this.waterTemperature = waterTemperature;
    }

    @Override
    public String toString() {
        return String.format("Вода: %s, Температура: %d", super.toString(), waterTemperature);
    }

}
