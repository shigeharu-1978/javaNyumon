package lists.chap12.list12_06;
public class Main {
	public static void main(String[] args) {
		Character c = new Character();		/* HeroやWizardではなく 
		 									Characterをnewしてしまった！ */
		Matango m = new Matango();
		c.attack(m);						/* オーバーライドされていないので
		 									なにも動かない */
	}
}
