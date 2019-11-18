package patterns.strategy.role;

import patterns.strategy.weanpon.Weapons;

public class Riven extends Role {
    public Riven(Weapons weapon) {
        super(weapon);
    }
    public Riven(){
        super();
    }
    //继承有父类role的属性和方法
}
