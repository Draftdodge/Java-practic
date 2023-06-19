package HW_OOP_4_V1.warriors;

import HW_OOP_4_V1.shields.Shield;
import HW_OOP_4_V1.weapons.Weapon;
import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private final String name; //final - если мы не планируем его менять
    private int healthPoint;
    private W weapon;
    private S shield;

    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }
    public W getWeapon() {
        return weapon;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public S getShield() {
        return shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public void setShield (S shield) {this.shield = shield;}


    public int hit(){ //наносит урон воин
        Random rand = new Random();
        int hitDamage = rand.nextInt(0, weapon.damage() + 1);
        return hitDamage;
    }

    public void reduceHealth(int damage, int protectbyShield){ // у другого уменьшается здоровье
        if (protectbyShield >= damage) {
            damage = 0;
        }
        else {
            healthPoint -= (damage - protectbyShield);
        }
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }


    public int protectByShield(){
        Random rand = new Random();
        int shildProtect = rand.nextInt(0, shield.protect() + 1);
        return shildProtect;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Hp: %d, Weapon: %s, Shield: %s", name, healthPoint, weapon, shield);
    }
}
