package lists.chap11.list11_09;
public class SuperHero extends Hero {	
	private boolean flying;		/* 新規追加のフィールド */
	public void fly(){			/* 新規追加のメソッド */
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land(){			/* 新規追加のメソッド */
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println("撤退した");
	}
	public void attack(Matango m){		/* 一回目の攻撃 */
		super.attack(m);
		if(this.flying) {
			super.attack(m);			/* 二回目の攻撃 */
		}
	}
}
