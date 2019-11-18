package patterns.strategy.weanpon;


/**
 * 实现武器攻击接口的武器类
 */
public class Sword implements Weapons {

    @Override
    public void useWeapon() {
        //攻击
        System.out.println("使用剑攻击");
    }

    @Override
    public String getName() {
        return "剑";
    }
}
