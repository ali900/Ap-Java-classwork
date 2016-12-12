package introUnit;
import java.util.Scanner;


public class IncrementOperators {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		int tuna = 5;
		int bass = 18;
		//++tuna;
		//--tuna;
		//post incrementing, changes value after its printed
		//System.out.println(tuna++);
		//takes tuna and adds 5 to it
		//tuna = tuna + 5;
		//adds 8 to tuna; can also use subtractions:assignment operators
		tuna += 8;
		System.out.println(tuna);
	}

}
