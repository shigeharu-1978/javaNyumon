package lists.chap04.list04_12;
public class Main {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3 };
    int[] b;
    b = a;
    b[0] = 100;
    System.out.println(a[0]);
  }
}
