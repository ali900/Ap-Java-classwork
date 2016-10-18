package array;

public class ArrayTesting {
	private static int[] results;
	public class ArraysMethod{
		static int[] dieArray = new int[11];
		static int[] results = new int[11];
		static int[] randomArray= new int [10];
		static String[] cardArray = new String[52];
	}

	public static void main(String[] args) {
		int[] fiftyNumbers = new int [50];
		populateOneToFifty(fiftyNumbers);
		print(fiftyNumbers);
		results = new int[11];

	}
	private static void print(int[] fiftyNumbers){
		for (int a: fiftyNumbers){
			System.out.println(a+"");
		}
		
	}
	private static void populateOneToFifty(int[] fiftyNumbers){
		for(int i =0; i < fiftyNumbers.length ; i++)
			
		{
			fiftyNumbers [i] = i + 1;
		}
	}
	
	private static void populateDieArray(int[] array){
		for(int i = 0; i < array.length; i++){
			int firstRoll= randInt(1,6);
		}
	}
	private static void populateResultsArray(int[] numsRolled){
		for(int d = 0; d<numsRolled.length;d++){

			results[numsRolled[d]-2]++;
		}
	}
	private static void printResults(int[] array){
		for(int i =0; i < array.length; i++){
			System.out.println((;i + 1 +"was rolled" +(double(array[i]/dieArray.length*100));
		}
	}
}
