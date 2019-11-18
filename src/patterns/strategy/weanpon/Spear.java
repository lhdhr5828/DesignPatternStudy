package patterns.strategy.weanpon;



public class Spear implements Weapons {

	@Override
	public void useWeapon(){
		System.out.println("使用长枪进行攻击!");
	}

	@Override
	public String getName() {
		return "长枪";
	}
}
