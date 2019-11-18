package patterns.strategy.role;


import patterns.strategy.weanpon.Weapons;

public class Yasuo extends Role {
    public Yasuo(Weapons weapon) {
        super(weapon);
    }

    public Yasuo() {
        super();
    }
    //继承有父类role的属性和方法
}
