package lists.chap12.list12_03;
public class Hero extends Character {
	public void attack(Matango m) {		/* Characterのattack
											メソッドをオーバーライドする*/
		System.out.println(this.name+"の攻撃!");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
}
