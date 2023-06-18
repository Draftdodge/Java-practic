package HW_OOP_2;

public class Main {
    public static void main(String[] args) {

        AquaticCreatures guppi = new Guppi("Клоун");
        AquaticCreatures snails= new Snails("Ули");

        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(guppi).addAnimal(snails).addAnimal(new Guppi("Счасливчик")).addAnimal(new Piraniya("Зубик"));

        System.out.println(aquarium);
    }
}