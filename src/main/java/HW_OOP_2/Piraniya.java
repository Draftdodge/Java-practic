package HW_OOP_2;

public class Piraniya extends Fish implements SwimSpeed{

    public Piraniya(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }
    @Override
    public String toString() {
        return String.format("Рыбы: %s, скорость: %d",super.toString(),getSwimSpeed());
    }
}
