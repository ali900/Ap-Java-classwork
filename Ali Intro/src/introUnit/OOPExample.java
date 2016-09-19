/**
 * 
 */
package introUnit;

/**
 * @author Student 8
 *This class is designed to contrast with the 
 *ProceduralExample. It embodies an Object-Oriented approach
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian","programmer");
		Student jordon = new Student("Jordon");
		Student jason = new Student("Jason");
		jillian.talk();

		jordon.talk();
		jason.talk();
		((Student)jillian).talk();
		//Student[] students = {jordan, jillian};
	}

}
