package lists.chap06.list06_07;
public class Calc{
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = lists.chap06.list06_05.CalcLogic.tasu(a,b);
		int delta = lists.chap06.list06_06.CalcLogic.hiku(a,b);
		System.out.println("足したら" + total + "、引いたら" + delta);
	}
}
