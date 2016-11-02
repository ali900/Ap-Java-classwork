package caveExplorer;

public class TwoDArrayPractices6 {

	public static void main(String[] args) {
		String[][] pic = new String[10][12];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0;col < pic[row].length; col++){
				pic[row][col]= " ";
			}
		}
		pic[1][2]= "O";
		pic[0][2]= "|";
		pic[2][2]= "|";
		pic[1][1]= "-";
		pic[1][3]= "-";
		pic[0][1]= "\\";
		pic[2][3]= "\\";
		pic[0][3]= "/";
		pic[2][1]= "/";
		for(int row = 7; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "M";
				int rand = (int)(Math.random()* ((7-3)+1)+3);
				int rand2 = (int)(Math.random()* ((7-3)+1)+3);
				pic[rand][rand2]= "OvO";
			}
		}
		for(int col =0 ; col < pic[0].length; col++){
			pic[0][col]= "_";
			pic[pic.length-1][col]= "_";
		}
		for(int row =1 ; row < pic.length; row++){
			pic[row][0]= "|";
			pic[row][pic[0].length-1]= "|";
		}
		printPic(pic);
		
	}
	public int rand(int low, int high){
		return(int) (Math.random()+low)*high;
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

