package introUnit;
import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {
		Scanner bucky= new Scanner(System.in);
		//when u have many variables that are the same type u can do the following:
		double fnum, snum, answer;
		System.out.println("Enter your first num: ");
		// a way to enter number and store in fnum
		// each data type in java needs its own method so it knows how to save it
		// .nextLine was for string and .nextDouble can be for numbers
		fnum= bucky.nextDouble();
		System.out.println("Enter your second num: ");
		snum= bucky.nextDouble();
		answer= fnum + snum;
		System.out.println(answer);
	}

}

