package game;

import java.util.ArrayList;

public class Helmet extends GameObjects{
    private ArrayList<Weapon> weapons;


    public Helmet() {
        this.weapons = new ArrayList<Weapon>();
    }

    public Weapon addWeapon(Weapon weapon){
        ArrayList<Weapon> weaponlist = new ArrayList<>();
        if(!weapons.contains(weapon)){
            weapons.add(weapon);
        }
        else{
            weapon.setLevel(weapon.getLevel()+1);
        }
        return weapon;
    }
    public ArrayList<Weapon> getWeaponList(){
        return weapons;
    }

}
