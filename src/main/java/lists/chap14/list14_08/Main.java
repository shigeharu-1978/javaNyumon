package lists.chap14.list14_08;
public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;		// 引数は単にhでもよい
		System.out.println(h.toString());
	}
}
