package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		System.out.print(Arrays.toString(arr));
		//each array is a row
		//columns is the length of an array
		//rows,columns
		String[][] arr2D = new[4][3];
		//iterate row by row:
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col <arr2D[row].length; col++){
				arr2D[row][col] = "("+row+","+col+")";
			}
		}
		//print each row
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
	}

}
