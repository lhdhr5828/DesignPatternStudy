package patterns.strategy.test;


import patterns.strategy.role.Role;
import patterns.strategy.role.Yasuo;
import patterns.strategy.weanpon.Gun;
import patterns.strategy.weanpon.Spear;
import patterns.strategy.weanpon.Sword;

public class FirstPatternTest {

    public static void main(String[] args) {
        //创建引用类型时，创建接口的引用类型
        Role yasuo = new Yasuo();
        //利用实现weapons接口的类作为组件来完成在运行期改变
        yasuo.setWeapon(new Gun());
        yasuo.attack(0,0);
        //改变武器攻击
        yasuo.setWeapon(new Spear());
        yasuo.attack(0,0);
        //再变一次
        yasuo.setWeapon(new Sword());
        yasuo.attack(0,0);
    }
}
