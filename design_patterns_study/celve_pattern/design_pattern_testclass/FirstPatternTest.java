package design_pattern_testclass;

import first_patterns_celve_modle.publicJILEI.Role;
import first_patterns_celve_modle.publicJILEI.Yasuo;
import first_patterns_celve_modle.suanfashixian.Gun;
import first_patterns_celve_modle.suanfashixian.Spear;
import first_patterns_celve_modle.suanfashixian.Sword;

public class FirstPatternTest {

	public static void main(String[] args) {
		//������������ʱ�������ӿڵ���������
		Role yasuo=new Yasuo();
		//����ʵ��weanpons�ӿڵ�����Ϊ���������������ڸı�
		yasuo.setWeanpon(new Gun());
		yasuo.attack();
		//�ı���������
		yasuo.setWeanpon(new Spear());
		yasuo.attack();
		//�ٱ�һ��
		yasuo.setWeanpon(new Sword());
		yasuo.attack();
	
	}

}
