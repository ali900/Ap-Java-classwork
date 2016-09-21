package datatype8;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {

		int[] results = new int [6];
		System.out.println("1 was rolled"+results[0]+"times.");
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls; index++){
			int roll = rollFairDie();
			System.out.println("Roll #"+(index+1)+
					"Die is"+roll);
			results[roll-1]++;
		}
		for(int i = 0; i<6; i++){
			int percentage= (int) (100* (double) results[i]/totalRolls)/100;
					System.out.println("was rolled"+results[i]/totalRolls +"times.");	
		}


	}
	public static int rollFairDie(){
		//		Random gen = new Random();
		//	return gen.nextInt(6)+1;
		double rand = Math.random();//random unbetween (0.1)
		int roll = (int) (6 * rand);//this is what
		return roll + 1;//0 becomes 1, 5 becomes 6

	}
	public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = ((int) (6 * rand))+1;
		return roll + 1;
	}

}
