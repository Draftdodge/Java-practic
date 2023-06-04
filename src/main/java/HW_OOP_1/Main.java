package HW_OOP_1;

public class Main {
    public static void main(String[] args) {

        VendingMachine coffeeMachine = new VendingMachine();
        coffeeMachine.addProduct(new Product("Water", 5,300))
                .addProduct(new Water("Вода_1",10,300,30))
                .addProduct(new Water("Вода_2", 15, 300, 90))
                .addProduct(new Water("Вода_3", 20, 500, 30))
                .addProduct(new Water("Вода_4", 25, 500, 90))
                .addProduct(new Coffee("Кофе_1", 150, 300,  "Коровье", "Капучино"))
                .addProduct(new Coffee("Кофе_2", 300, 300,  "Кокосовое", "Капучино"))
                .addProduct(new Coffee("Кофе_3", 150, 300,  "Коровье", "Латте"))
                .addProduct(new Tea("Чай_1", 100, 300,  "Черный"))
                .addProduct(new Tea("Чай_2", 150, 300,  "Зеленый"));

        System.out.println(coffeeMachine);
//        Product product = coffeeMachine.findProduct("Кофе");
//        System.out.println(product);

        System.out.println("+++++++++++++++++++++");
        Product saledProduct = coffeeMachine.saleProduct("Вода_1");
        System.out.println(saledProduct);
        System.out.println("+++++++++++++++++++++");
        Product saledProduct2 = coffeeMachine.saleProduct("Кофе_2");
        System.out.println(saledProduct2);
        System.out.println(coffeeMachine);

    }
}