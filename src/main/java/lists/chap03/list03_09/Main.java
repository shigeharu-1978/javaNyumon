package lists.chap03.list03_09;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // iは1から9まで繰り返し
            for (int j = 1; j < 10; j++) { // jも1から9まで繰り返し
                System.out.print(i * j); // かけ算の結果を出力
                System.out.print(" "); // 空白を出力
            }
            System.out.println(""); // 改行を出力
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            String string = args[i];
            System.out.println(count);
        }
        
    }
}
