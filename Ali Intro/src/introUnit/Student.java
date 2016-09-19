package introUnit;

public class Student {

	// field
	private String name;

	//constructor ( no return teype. It creates students)
	public Student(String name){
		//initialize fields
		this.name = name;
	}
	public void talk(){

		//call the super method
		System.out.println("Hi, my name is "+this.name);
	}
		}

//encapsulation- private fields
//polymorphism- calling a sneior a student
//inheritance-  inheriting the talk method
//only call super if im a sub class of somethingtaking the instuctor from a super clas