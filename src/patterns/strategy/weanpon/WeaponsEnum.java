package patterns.strategy.weanpon;

public enum WeaponsEnum implements Weapons {
    /**
     *
     */
    GUN("枪"), SPEAR("长枪"), DEFAULT("拳头"), SWORD("剑");

    WeaponsEnum(String name) {
        this.name = name;
    }

    WeaponsEnum() {

    }

    private String name;

    @Override
    public void useWeapon() {
        System.out.println("使用" + this.getName() + "攻击");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
