package lists.chap12.list12_17;
public abstract class Character {
	String name;
	int hp;
	
	public String getName(){
		return this.name;
	}

	public void run(){
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
}
