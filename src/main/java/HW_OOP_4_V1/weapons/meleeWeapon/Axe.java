package HW_OOP_4_V1.weapons.meleeWeapon;

public class Axe implements Melee {
    @Override
    public int damage() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Axe, Damage: %d",damage());
    }
}
