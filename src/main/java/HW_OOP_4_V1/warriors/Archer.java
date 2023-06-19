package HW_OOP_4_V1.warriors;

import HW_OOP_4_V1.shields.SmallShield;
import HW_OOP_4_V1.weapons.rangedWeapon.Range;

public class Archer extends Warrior<Range, SmallShield>{
    public Archer(String name, int healthPoint, Range weapon, SmallShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int dinstance(){
        return (super.getWeapon()).distance();
    }


    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), dinstance());
    }
}
