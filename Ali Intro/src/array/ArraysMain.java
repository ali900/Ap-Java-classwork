package array;

public class ArraysMain {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has" + "a number equal to"
		+sample.getNumber());
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in" +(endTime-startTime)+"milliseconds");
	}
	private static void passByValueDemonstration(){

		//This is how you time how quickly a computer processes
		//arrays get changed, variables don't

		String[] someStrings = new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
		arrayIntroMethod();

		int ten = 10;
		increase(ten);
		System.out.println("Ten, increase is"+ten);

		System.out.println("Before "+someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \"changeString\""+someStrings[99]);
		printArray(someStrings);
		changeArrayElement(someStrings,99);


	}
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item "+(i+1);
	}
	private static void increase(int x) {
		x=x+1;

	}
	private static void changeString(String s){
		s= "This string has been changed.";
	}

	private static void printArray(String[] b){
		for(String a: b){
			System.out.println(a);
		}
	}

	private static void populateArray(String[] a){
		//this loop instantiating the strings
		for(int index =0; index < a.length ; index++)
		{
			a[index] = "value" + (index+1);
		}
	}

	public static void arrayIntroMethod(){
		// Construct 3 integer arrays
		//these two methods do the same thing
		//primitive type arrays fill with zeroes 0, 0.0, false
		int[] zeroes1= {0,0,0};
		int[] zeroes2= new int[3];
		//if you don't populate array it'll be filled with zeroes
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//FIRST METHOD:"FOR LOOP"
		//  -the index of the data is important to reference
		//  -you need to customize how you iterate
		//(increase by 2, backwards, etc...)
		for(int index = 0; index<booleans.length; index++){
			System.out.println(index + ")"+ booleans[index]);
		}
		//SECOND METHOD: "FOR-EACH"
		//always goes in order, does not keep track of index
		//easier to type
		for(boolean b: booleans){
			System.out.println(b+"");
		}

		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}

}
