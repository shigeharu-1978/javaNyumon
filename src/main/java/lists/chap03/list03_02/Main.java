package lists.chap03.list03_02;
public class Main {
  public static void main(String[] args) {
    boolean doorClose = true;     // ここでtrueかfalseを代入
    int count = 2;
    doorClose = doorClose == true;
    while(doorClose == true) {    // ドアが閉まっている間は…
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }
  }    // 注意：このプログラムは実際に実行しないでください
}      //       無限に繰り返し、プログラムが終わりません
