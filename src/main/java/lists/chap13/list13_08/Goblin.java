package lists.chap13.list13_08;
public class Goblin extends Monster{
	final int LEVEL = 10;
	char suffix;
	
	void run() {
		System.out.println("ゴブリン" + this.suffix + "はダダダっと逃げ出した！");
	}
}
