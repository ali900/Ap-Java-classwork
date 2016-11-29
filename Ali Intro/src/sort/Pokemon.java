package sort;

public class Pokemon {
	private int hp;
	private int level = 1;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int level){
		hp= 100;
		this.level=level;
		this.name = name;
		this.poisoned = false;
		
	}
	public void iChooseYou(){
		System.out.print(name+"," + name + "!");
		
}
	public int gethp(){
		return hp;
	}
}
