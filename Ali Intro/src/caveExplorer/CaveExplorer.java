package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {

	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	private static Inventory inventory;
	private static String input;
	
	public static void main (String[] args){
		caves= new CaveRoom[5][5];
		for(int row = 0; row < caves.length;row++){
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoom("This cave"+ "has coordinates "+row+","+col);
			}
		}
		currentRoom = caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(CaveRoom.EAST, caves[0][2], new Door());
		caves[0][2].setConnection(CaveRoom.SOUTH, caves[1][2], new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH, caves[2][2], new Door());
		setInventory(new Inventory());
		startExploring();
	}

	private static void startExploring() {
		while(true){
			System.out.println("inventory.getDescription");
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			//String
			setInput(in.nextLine());
		}
		
	}

	public static String getInput() {
		return input;
	}

	public static void setInput(String input) {
		CaveExplorer.input = input;
	}

	public static Inventory getInventory() {
		return inventory;
	}

	public static void setInventory(Inventory inventory) {
		CaveExplorer.inventory = inventory;
	}
	
}
