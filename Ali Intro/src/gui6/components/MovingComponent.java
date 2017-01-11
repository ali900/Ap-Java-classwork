package gui6.components;

import java.awt.Color;
import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {
	private long moveTime; //time when the image last moved
	private double vx; //the horizontal velocity
	private double vy; //the vertical velocity
	private double posx; //the actual x-coordinate of the object
	private double posy; //the actual y-coordinate of the object
	private boolean running;

	public static final int REFRESH_RATE = 20;
	
	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setX(int x) {
		super.setX(x);
		posx = x; //now the actual position is synced with the pixel (screen)  position
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void setY(int y) {
		this.y = y;
	}
	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}
	
	public void run() {
		posx =getX();
		posy =getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running){
			try{Thread.sleep(REFRESH_RATE);
			checkBehaviors();
			update();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public void checkBehaviors(){
		if(posy+vy > 300){
			posy = 300;
			vy=-vy;
		}
		else if(posy+vy < 20){
			posy = 20;
			vy=-vy;
		}

		if(posx+vx > 300){
			posx = 300;
			vx=-vx;
		}
		else if(posx+vx < 20){
			posx = 20;
			vx=-vx;
		}

	}

	@Override
	public void update(Graphics2D g){
		long currentTime = System.currentTimeMillis();
		int difference = (int)(currentTime - moveTime);
		if(difference >= REFRESH_RATE){
			//UPDATE MOVEtIME SINCE A MOVE IS HAPPENING
			moveTime = currentTime;
			//calculate the new position
			posx += vx *(double)difference/REFRESH_RATE;
			posx += vy *(double)difference/REFRESH_RATE;
			//note: for very low velocities,
			//the position might not change every time,
			//so rounding down to an int might make it
			//look like nothing changed, but posx and 
			//posy will keep track of fractions of a change
			super.setX((int)posx);//change only x, not pos x
			super.setY((int)posy);
		}
		drawImage(g);
	}

	private void drawImage(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillOval(0, 0, getWidth(), getHeight());
	}
	
	public void play(){
		
	}
}
