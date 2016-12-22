package gui6.sampleGames;

import gui6.GUIApplication;
import gui6.Screen;
import gui6.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	//FIELDS
	public static MouseFollower game;//only ONE exists
	public static MovementScreen moveScreen;

	private CoordinateScreen coordScreen;
	
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		moveScreen = new MovementScreen(getWidth(), getHeight());
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}








