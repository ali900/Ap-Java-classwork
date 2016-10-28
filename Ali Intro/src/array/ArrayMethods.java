package array;

import java.util.Random;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,9, 11, 12,15};
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has"
				+ " a number equal to "+sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in "
				+ (endTime-startTime)+ " milliseconds");
		testPrimes(50);		
/*		swap(arr, 0, arr.length-1);
		if (checkHalfWay(arr,12,0, arr.length-1)){
			System.out.println("The number you are searching for is less than the value"
					+ " in the middle of the array");
		}else{
			System.out.println("The number you are searching for is greater in than or equal "
					+ "to the value in the middle of the array");
		}

*/	}
	/**
	 * returns true if searchValue is less than the element
	 * halfway between beginning and end
	 * @param arr the int[] to be searched
	 * @param i
	 * @param j
	 * @param length
	 */
	private static void swap(int[] arr, int i, int j){
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}

	public static boolean checkHalfway(int[] arr, int searchValue,int begin, int end){
		return searchValue < arr[(begin+end)/2];
	}
	public static void shuffle(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
	}
	public static int countUnderBound(double[] arr, double d){
		int ctr = 0;
		for( int i = 0; i < arr.length; i++){
			if(arr[i] <d){
				ctr++;
			}
		}
		return ctr;
	}
	public static boolean contains(int[] arr, int[] subArray){
		for(int i= 0; i < arr.length; i++){
			if(arr[i] == subArray[0]){
				//check the rest of the elements
				int j = 0;
				while(j < subArray.length){
					if(subArray[j] == arr[i+j] && j == subArray.length-1){
						System.out.println("Found a match at index "+i);
						return true;
					}else if(subArray[j] != arr[i+j]){
						System.out.println("No match at "+i);
						break;
					}
					j++;
				}
			}
			return false;
		}
		return false;
	}
	public static int[] getSubArray(int [] arr, int startIndex, int endIndex){
		int [] subArray = new int[endIndex - startIndex +1];
		for(int i = 0; i<subArray.length; i++){
			subArray[i] = arr[startIndex +i];
		}
		return subArray;
	}
	
	/*private static int[] randomArrayWithNoRepeat (int[] arr){
		int[] newArr = new int[arr.length];
		for(int i = 0; i < newArr.length; i++){
			int add = arr[(int)Math.random() * arr.length];
			while(indexOf(arr,add) > -1){
				add = arr[(int)Math.random()*arr.length];
			}
			newArr[i] = add;
		}
		return newArr;
	}*/
	private static void testPrimes(int numberToTest) {
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i=0; i < numberToTest; i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		
		for(int prime = 2; prime <= lastToCheck; prime++){
			//when checking 50 numbers,
			//tests 2,3,4,5,6,7 as if prime
			if(theNumbers[prime]){
				//only checks numbers that are prime
				//(numbers that haven't been "crossed off")
				//won't check 4 and 6 (crossed off by 2)
				System.out.println("\n"+prime+ " is prime. "
						+ "Crossing off:");

				for(int test = prime + prime; test < numberToTest; 
						test = test + prime){
					System.out.print(test+", ");
					theNumbers[test] = false;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i + " is prime.");
			}
		}
		
	}
}	
