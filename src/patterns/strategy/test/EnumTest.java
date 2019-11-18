package patterns.strategy.test;

import patterns.strategy.role.Riven;
import patterns.strategy.role.Role;
import patterns.strategy.weanpon.WeaponsEnum;

/**
 * @author edz
 */
public class EnumTest {
    public static void main(String[] args) {
        Role riven = new Riven(WeaponsEnum.DEFAULT);
        riven.attack(0, 0);
        riven.setWeapon(WeaponsEnum.SWORD);
        riven.attack(0, 0);
        riven.setWeapon(WeaponsEnum.GUN);
        riven.attack(0, 0);
    }
}
