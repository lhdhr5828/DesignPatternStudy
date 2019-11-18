package patterns.strategy.role;


import patterns.strategy.weanpon.DefaultWeapon;
import patterns.strategy.weanpon.Weapons;

//一个角色类
public class Role {

    public Role(Weapons weapon) {
        this.weapon = weapon;
    }

    public Role() {
        this.weapon = new DefaultWeapon();
    }

    /**
     * 攻击次数
     */
    private int count;
    private Weapons weapon;


    public void attack(int a, int b) {
        setCount((int) (Math.random() * 100));
        System.out.println(getCount());
        this.weapon.useWeapon();
        System.out.println(this.getClass().getName() + " use " + this.weapon.getName() + " attack " + this.getCount() + " counts!");
    }

    private int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    private Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

}
