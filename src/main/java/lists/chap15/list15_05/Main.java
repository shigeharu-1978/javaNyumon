package lists.chap15.list15_05;
public class Main{
  public static void main(String[] args){
    Person p = new Person();
    p.setAge(-128);	 //誤った値のセットを試みる→例外発生
  }
}
