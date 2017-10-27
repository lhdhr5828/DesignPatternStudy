package design_pattern_testclass;

import first_patterns_celve_modle.publicJILEI.Role;
import first_patterns_celve_modle.publicJILEI.Yasuo;
import first_patterns_celve_modle.suanfashixian.Gun;
import first_patterns_celve_modle.suanfashixian.Spear;
import first_patterns_celve_modle.suanfashixian.Sword;

public class FirstPatternTest {

	public static void main(String[] args) {
		//创建引用类型时，创建接口的引用类型
		Role yasuo=new Yasuo();
		//利用实现weanpons接口的类作为组件来完成在运行期改变
		yasuo.setWeanpon(new Gun());
		yasuo.attack();
		//改变武器攻击
		yasuo.setWeanpon(new Spear());
		yasuo.attack();
		//再变一次
		yasuo.setWeanpon(new Sword());
		yasuo.attack();
	
	}

}
