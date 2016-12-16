package introUnit;

public class CompoundInteresyForLoop {

	public static void main(String[] args) {
		double amount;
		double principles = 10000;
		double rate = .01;
		
		for(int day = 1; day<=730; day++){
			amount = principles*Math.pow(1 + rate, day);
			System.out.println(day+ "   "+ amount);
		}

	}

}
