package lists.chap13.list13_10;
public class DeathBat extends Monster{
	final int LEVEL = 10;
	char suffix;
	
	public void run() {
		System.out.println("地獄コウモリ" + this.suffix + "は逃げ出した！");
	}
}
