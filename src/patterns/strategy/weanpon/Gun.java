package patterns.strategy.weanpon;


public class Gun implements Weapons {
    @Override
    public void useWeapon() {
        System.out.println("使用火枪进行攻击！");
    }

    @Override
    public String getName() {
        return "火枪";
    }
}
