package HW_OOP_2;

public class Guppi extends Fish implements SwimSpeed{
    public Guppi(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }
    @Override
    public String toString() {
        return String.format("Рыбы: %s, скорость: %d",super.toString(),getSwimSpeed());
    }
}
