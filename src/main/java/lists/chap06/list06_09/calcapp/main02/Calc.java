package lists.chap06.list06_09.calcapp.main02;
import lists.chap06.list06_09.calcapp.logics02.CalcLogic;

public class Calc{
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a,b);	// FQCNじゃなくてもOK
		int delta = lists.chap06.list06_09.calcapp.logics02.CalcLogic.hiku(a,b);
									// もちろんFQCNで書いてもOK
		System.out.println("足したら" + total + "、引いたら" + delta);
	}
}
