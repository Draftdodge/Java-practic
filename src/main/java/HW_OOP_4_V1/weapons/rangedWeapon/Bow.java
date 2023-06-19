package HW_OOP_4_V1.weapons.rangedWeapon;

public class Bow implements Range {
    @Override
    public int damage() {
        return 4;
    }

    @Override
    public int distance() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("Bow, Damage: %d",damage());
    }
}
