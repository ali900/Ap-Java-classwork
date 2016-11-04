package caveExplorer;

public class TwoDArrayIntro2 {

	public static void main(String[] args) {
		boolean[][]mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		mathchValues(field, mines);
		printPic(field);

	}

	private static void mathchValues(String[][] field, boolean[][] mines) {
		for(int row= 0; row < field.length; row++){
			for(int col= 0; col < field[0].length; col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
		
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		//r and c represent coordinates of element we are providing a string for
		int count= 0;
		for(int row = r-1; row <= r+1; row++){
			for(int col= c-1; col <= c+1; col++){
				
			}
		}
		//this method only checks elements in the [][]
		//so it is not necessary to verify if they are valid
		/*for(int row = 0; row < mines.length; row++){
			for(int col= 0; col < mines[row].length; col++){
				if(Math.abs(row-r)+Math.abs(col-c) == 1 &&
						//check if true
						mines[row][col]){
					count++;
				}
			}
		*/
		//this method is helpful when you want to be very specific
		//above
		count += validAndTrue(mines, r-1, c);
		//below
		count += validAndTrue(mines, r+1, c);
		//right
		count += validAndTrue(mines, r, c+1);
		//left
		count += validAndTrue(mines, r, c-1);
		return count +"";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		//checks valid
		if( i >= 0 && i < mines.length && j >= 0 && j < mines[0].length&&
				mines[i][j]){
			//check if its true
			return 1;
		}
		return 0;
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines >0){
			int row= (int)(Math.random()* mines.length);
			int col= (int)(Math.random()* mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines --;
			}
		}
		
	}

	public static void printPic(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0;col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}

}
