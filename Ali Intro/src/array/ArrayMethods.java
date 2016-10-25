package array;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,9, 11, 12,15};
		
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

	private static boolean chackHalfway(int[] arr, int searchValue,int begin, int end){
		return searchValue < arr[(begin+end)/2];
	}
	private static void shuffle(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
	}
	private static void print(int[] arr){
		//
	}
	public static int countUnderBound(double[] arr, double d){
		int numberElements = 0;
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
	}
	public static int[] getSubArray(int [] arr, int startIndex, int endIndex){
		int [] subArray = new int[endIndex - startIndex +1];
		for(int i = 0; i<subArray.length; i++){
			subArray[i] = arr[startIndex +i];
		}
	}
}
