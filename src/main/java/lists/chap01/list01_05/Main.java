package lists.chap01.list01_05;public class Main {   public static void main(String[] args) {    final double TAX = 1.08;    int fax = 5;    System.out.println( "5万円から4万円に値下げします");    //TAX = 4;    System.out.println( "ＦＡＸの新価格（税込み）");    System.out.println( fax * TAX + "万円" );  }}/* このコードはコンパイルエラーが発生します */