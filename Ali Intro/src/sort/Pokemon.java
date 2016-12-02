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
	public int getHP(){
		return hp;
	}
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}else{
			System.out.println("The attack missed");
		}
	}
	public void setHP(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setPoisoned(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void lapse() {
		// TODO Auto-generated method stub
		
	}
}
