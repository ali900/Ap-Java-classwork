package simonAli;


import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import gui6.components.*;



public class ProgressNockles extends Component implements ProgressInterfaceAli {

	private static final int WIDTH = 120;
	private static final int HEIGHT = 50;

	private boolean gameOver;
	private String round;
	private String sequence;

	public ProgressNockles() {
		super(60,60,WIDTH,HEIGHT);
	}



	public void setRoundInt(int roundNumber) {
		round = "Round "+roundNumber;
		update();
	}

	public void setSequenceSize(int size) {
		sequence = "Sequence length "+size;
		update();
	}

	public void gameOver() {
		gameOver = true;
		update();
	}



	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		FontMetrics fm = g.getFontMetrics();
		if(gameOver){
			g.setColor(new Color(255,55,90));
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.white);
			String go = "GAME OVER!";
			g.drawString(go, (WIDTH - fm.stringWidth(go))/2, 20);
			g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);

		}else{
			g.setColor(new Color(220,255,230));
			g.fillRect(0, 0, WIDTH, HEIGHT);
			g.setColor(Color.black);
			g.drawRect(0, 0, WIDTH-1, HEIGHT-1);
			if(round !=null && sequence != null){

				g.drawString(round, (WIDTH - fm.stringWidth(round))/2, 20);
				g.drawString(sequence, (WIDTH - fm.stringWidth(sequence))/2, 40);
			}
		}
	}





	@Override
	public SimonScreenX get(int sequenceIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}