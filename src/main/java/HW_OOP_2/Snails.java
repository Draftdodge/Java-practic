package HW_OOP_2;

public class Snails extends AquaticCreatures implements SwimSpeed {
    public Snails(String name) {
        super(name);
    }
    @Override
    public int getSwimSpeed() {
        return 1;
    }
    @Override
    public String toString() {
        return String.format("Улитки: %s, скорость: %d",super.toString(),getSwimSpeed());
    }
}
