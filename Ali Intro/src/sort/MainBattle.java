package sort;

public class MainBattle {

	public static void main(String[] args) {
		Pokemon raticate = new Pokemon("Raticate",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		raticate.attack(bulbasaur, new Attack() {

			public void attack(Pokemon target) {
				int newHP = target.getHP()/2;
				
			}
		});
		System.out.println("Bulbasaur is preparing to attack with poison.");
		bulbasaur.attack(raticate, new Attack() {

			public void attack(final Pokemon target) {
				target.setPoisoned(true);
			}
		});
		raticate.lapse();
		bulbasaur.lapse();
		printScore(raticate, bulbasaur);
	}

	private static void printScore(Pokemon raticate, Pokemon bulbasaur) {
		// TODO Auto-generated method stub
		
	}

}
