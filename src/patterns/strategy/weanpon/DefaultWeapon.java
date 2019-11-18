package patterns.strategy.weanpon;

/**
 * 定义默认的武器拳头
 */
public class DefaultWeapon implements Weapons {


    @Override
    public void useWeapon() {
        System.out.println("使用拳头攻击");
    }

    @Override
    public String getName() {
        return "默认武器：拳头";
    }
}
