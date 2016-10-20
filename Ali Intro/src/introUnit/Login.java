package introUnit;
import java.util.Scanner;

public class Login {
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	//1 point "private" or inaccessible
	//1 point for declaration of data type (String)
	public static String username= "test_user";
	private static String password = "test";
	
	//1 point correct method header
	public static void main(String[] args) {
		//1 point, user has one chance to enter name
		if (correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown user name");
		}

	}
	private static void askPassword(){
		boolean inLoop = true;
		int remainingTries = 3;
		//1 point, using a loop
		while(inLoop){
			System.out.println("Enter your password.");
			//1 point for "waitForEntry()"
			String entry= waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in!");
				inLoop = false;
			}
			else{
				remainingTries--;
				//.5 3 tries MAX
				//.5 says "invalid password" after 3
				if(remainingTries == 0){
					System.out.println("invalid passwprd.");
					//terminates the method
					inLoop=false;
				}
				else{
					//.5 point for printing a changing number
					//.5 correct number
					System.out.println("Incorrect password"+"you have "
				+remainingTries+" "+ "try left");
				}
			}
		}
	}
	
	private static boolean correctUser(){
		System.out.println("Enter username.");
		if(waitForEntry().equals(username)){
			return true;
		}
		return false;
	}

}
