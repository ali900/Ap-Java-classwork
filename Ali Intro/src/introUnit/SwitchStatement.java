package introUnit;

public class SwitchStatement {

	public static void main(String[] args) {
		int age;
		age= 3;
		//switch finds the variable value in the parameters	
		// put switch and put the variable you wanna test the value of
		// the you put the values that are possible after the word case
		// in the case body, test the value
		
		switch(age){
		//instead of writing a bucnh of if statements you can write case statements
		//
		case 1:
			System.out.println("You can crawl");
			//if this is true and age equals 1 then there is no reason to go 
			//to rest of the program and you can exit
			break;
		case 2:
			System.out.println("You can crawl");
			break;
		case 3:	
			System.out.println("You can get in trouble");
			break;
		//last thing u have in every switch statement is a default
		//if none of the values are true then u have a default statement, it already know  
		//that if every other case is false then u don't need a value for default don't need a value
		default:
			System.out.println("I dont know how old you are");
			break;
		}

	}

}
