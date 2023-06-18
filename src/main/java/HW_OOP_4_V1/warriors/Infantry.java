package HW_OOP_4_V1.warriors;

import HW_OOP_4_V1.shields.BigShield;
import HW_OOP_4_V1.weapons.meleeWeapon.Melee;

public class Infantry extends Warrior<Melee, BigShield>{
    public Infantry(String name, int healthPoint, Melee weapon, BigShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantry: %s",super.toString());
    }
}
