package first_patterns_celve_modle.publicJILEI;

import java.util.Random;

import first_patterns_celve_modle.suanfashixian.Weanpons;

//һ����ɫ��
public class Role {

	//��������
	private int count;
	private Weanpons weanpon; 
	public void  attack() {
		setCount((int)(Math.random()*100));
		System.out.println(getCount());
		this.getWeanpon().useWeanpon();
		System.out.println(this.getClass().getName()+" use "+getWeanpon().getClass().getName()+" attack "+this.getCount()+" counts!");
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Weanpons getWeanpon() {
		return weanpon;
	}

	public void setWeanpon(Weanpons weanpon) {
		this.weanpon = weanpon;
	}

}
