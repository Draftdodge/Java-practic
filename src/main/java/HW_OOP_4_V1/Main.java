package HW_OOP_4_V1;

import HW_OOP_4_V1.shields.BigShield;
import HW_OOP_4_V1.shields.SmallShield;
import HW_OOP_4_V1.warriors.Archer;
import HW_OOP_4_V1.warriors.Infantry;
import HW_OOP_4_V1.warriors.Warrior;
import HW_OOP_4_V1.weapons.meleeWeapon.Axe;
import HW_OOP_4_V1.weapons.meleeWeapon.Sword;
import HW_OOP_4_V1.weapons.rangedWeapon.Bow;
import HW_OOP_4_V1.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Warrior infantry = new Infantry("Player_1", 35, new Sword(), new BigShield());
        Infantry axeInfantry = new Infantry("Player_2", 15, new Axe(), new BigShield());
        Infantry swordInfantry = new Infantry("Player_3", 11, new Sword(), new BigShield());
        Archer archer = new Archer("Player_4", 61, new Bow(), new SmallShield());
        Archer bowArcher = new Archer("Player_5", 14, new Bow(), new SmallShield());
        Archer crossBowArcher = new Archer("Player_6", 39, new CrossBow(), new SmallShield());

        Team<Warrior> team1 = new Team();
        team1.add(infantry);
        team1.add(archer);
        team1.add(new Infantry("Player_6", 55, new Axe(), new BigShield()));

        Team<Archer> archers = new Team<>();
        archers.add(bowArcher);
        archers.add(crossBowArcher);
        archers.add(new Archer("Player_7", 45, new CrossBow(), new SmallShield()));

        Team<Infantry> infantries = new Team<>();
        infantries.add(axeInfantry);
        infantries.add(swordInfantry);
        infantries.add(new Infantry("Player_8", 65, new Axe(), new BigShield()));

        System.out.println(team1);
        System.out.println("-------------------------");
        System.out.println(archers);
        System.out.println("-------------------------");
        System.out.println(infantries);
        System.out.println("-------------------------");

        Battle fight1 = new Battle(axeInfantry, swordInfantry);
        fight1.fight();

    }
}
