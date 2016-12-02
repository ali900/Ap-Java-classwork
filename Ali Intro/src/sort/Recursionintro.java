package sort;

public class Recursionintro {

	public static void main(String[] args) {
		//with a for loop
		System.out.println("Using a for loop...");
		for(int i= 0; i < 5; i++){
			System.out.println("Hello everyone");
		}
		System.out.println("Using recursion!");
		int numberOfTimes = 5;
		//an implementation of an interface written into a parameter
		forLoop(numberOfTimes, new Action() {
			public void act(){
				System.out.println("Hi");
			}
		});
	}
	private static void forLoop(int numberOfTimes, Action action){
		
	}
	public static void hanoi(int numberOfDiscs,
			String from,
			String mid,
			String to){
		if(numberOfDiscs <= 2){
			print("Move from"+from+"to"+to);
		}else{
			hanoi(numberOfDiscs-1,from,to,mid);
			//move the last one to c
			hanoi(1, from,mid,to);
			hanoi(numberOfDiscs-1,mid,from,to);
		}
	}
	private static int moveCount = 1;
	private static void print(String string) {
		// TODO Auto-generated method stub
		
	}

}
