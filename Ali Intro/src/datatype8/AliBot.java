package datatype8;

import java.util.Scanner;

public class AliBot {

	static Scanner input;
	static String user;
	static int lineCount;

	public static void main(String[] args) {
		createAScanner();
		demonstrateStringMethods();
		promptInput();
		talkForever();
	}
	
	public static void talkForever(){
		while(true){
			promptInput();
		}
	}
	
	public static void promptInput(){
		String userInput = input.nextLine();
		print("You typed: "+userInput);
	}

	public static void print(String s){
		String printString = "";
		int cutoff = 35;
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are less than the cutoff
			//do the following loop
			while(currentLine.length() + nextWord.length() 
			<= cutoff && s.length() > 0){
				//add the next word to the line
				currentLine +=nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word		
				int endOfWord = s.indexOf("");
				// check if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() -1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord +1);
				
			}
			printString+= currentLine + "/n";
		}
		System.out.println(printString);
	}

	public static void createAScanner(){
		input= new Scanner(System.in);
	}

	public static void demonstrateStringMethods(){
		String text1 ="Hello World";
		String text2 ="Hello ";
		String text3 ="World";
		if(text1.equals( text2+text3)){
			System.out.println("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2+text3);

		String word1= "aardvark";
		String word2= "Zyzzyva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word 1 is before word 2," + "lexicongraphically.");

		}
	}
}


