package lists.chap10.list10_13;
public class King {
	void talk(Hero h) {
		System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
		System.out.println("王様：長旅疲れたであろう、そこで横になって休むがよい");
		h.bye(); 	
	}
}
