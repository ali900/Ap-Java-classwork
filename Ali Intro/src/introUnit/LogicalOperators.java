package introUnit;

public class LogicalOperators {

	public static void main(String[] args) {
		int boy, girl;
		boy = 8;
		girl = 99;
		//&& makes sure that both statements in the if are true 
		// || means or: either one statement has to be true or the other has to
		// be true in order to execute the first statement
		if(boy>10 || girl < 60){
			System.out.println("You can enter");
		}
		else{
			System.out.println("You can not enter");
		}

	}

}
