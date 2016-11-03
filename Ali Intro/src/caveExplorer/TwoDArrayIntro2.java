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
		return null;
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
