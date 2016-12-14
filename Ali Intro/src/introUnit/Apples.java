package introUnit;
import java.util.Scanner;
class Apples {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Tuna TunaObject = new Tuna();
		System.out.println("Enter name of your first girlfriend here: ");
		String temp = input.nextLine();
		TunaObject.setName(temp);
		TunaObject.getSaying();
	}

}
