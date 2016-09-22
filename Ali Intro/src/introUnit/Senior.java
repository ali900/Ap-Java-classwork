package introUnit;

public class Senior extends Student {
	private String internship;

	public Senior(String name, String internship) {
		super(name);

		// TODO Auto-generated constructor stub
	}
	public void talk(){
		System.out.println("... and I am a senior!");
		System.out.println("I intern as" + internship);
	}
}

