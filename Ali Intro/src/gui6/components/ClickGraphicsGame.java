package gui6.components;

public class ClickGraphicsGame {

	public static void main(String[] args) {
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();

	}
	public ClickGraphicsGame(){
		super(500, 500);
	}
	
	@Override
	public void initScreen(){
		
	}
}
