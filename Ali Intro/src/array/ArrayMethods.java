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
		
	}
	private static void print(int[] arr){
		
	}
}
