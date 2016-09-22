package datatype8;

import java.util.Scanner;

public class StringPractice {

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
		System.out.println(s);
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


