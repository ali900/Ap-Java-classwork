package gui6.whackAMole;

import gui.simon.GUIApplication;

public class WhackAMoleGame extends GUIApplication {

	public WhackAMoleGame(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = 
				new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}

	private void setScreen(WhackAMoleScreen wams) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		WhackAMoleGame wamg = new WhackAMoleGame(800, 500);
		Thread game = new Thread(wamg);
		game.start();
	}

}