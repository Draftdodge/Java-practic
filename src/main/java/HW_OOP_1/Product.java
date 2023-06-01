package HW_OOP_1;

public class Product {
    private String productName;
    private double productPrice;
    private Integer productVolume;


    public Product(String productName, double productPrice, Integer productVolume) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productVolume = productVolume;
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s, Цена: %f, Объем: %d", productName, productPrice, productVolume);
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getProductVolume() {
        return productVolume;
    }
}