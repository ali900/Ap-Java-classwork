package gui6.components;

public class ClickableGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Action action;
	public ClickableGraphic(int x, int y, int w, int h, String){
		super(x, y, w, h, imageLocation);
	}
	
	public void setAction(Action a){
		this.action= a;
	}
}
