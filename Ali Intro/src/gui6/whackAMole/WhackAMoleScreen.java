package gui6.whackAMole;
import java.util.ArrayList;
public class WhackAMoleScreen extends ClickableScreen {
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public WhackAMoleScreen(int width, int height) {
		
	}
	private void updateTimer(){
		
	}
	/**
	 *to implement later, after Character Team implements PlayerInterface
	 */
	private PlayerInterface getAPlayer() {
		return null;
	}

	/**
	 *to implement later, after EnemyTeam implements MoleInterface
	 */
	private MoleInterface getAMole() {
		return null;
	}
}
