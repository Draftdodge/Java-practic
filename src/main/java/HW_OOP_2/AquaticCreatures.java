package HW_OOP_2;

public abstract class AquaticCreatures extends Aquarium {
    protected String name;

    public AquaticCreatures(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s", name);
    }
}