package lists.chap13.list13_09;
public class Slime extends Monster{
	final int LEVEL = 10;
	char suffix;
	
	void run() {
		System.out.println("スライム" + this.suffix + "は体をうねらせながら逃げ出した！");
	}
}
