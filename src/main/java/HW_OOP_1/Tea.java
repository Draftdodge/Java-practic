package HW_OOP_1;

public class Tea extends Product{
    private String teaType;

    public Tea(String productName, double productPrice, Integer productVolume, String teaType){
        super(productName, productPrice, productVolume);
        this.teaType = teaType;
    }

    @Override
    public String toString() {
        return String.format("Чай: %s, Тип: %s", super.toString(), teaType);
    }
}
