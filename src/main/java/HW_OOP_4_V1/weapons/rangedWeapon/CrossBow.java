package HW_OOP_4_V1.weapons.rangedWeapon;

public class CrossBow implements Range {
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int distance() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("CrossBow, Damage: %d",damage());
    }
}
