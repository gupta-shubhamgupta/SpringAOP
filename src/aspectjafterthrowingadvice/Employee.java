package aspectjafterthrowingadvice;

public class Employee {
	public void validate(int age) throws Exception{
		if(age<18) {
			throw new ArithmeticException("Not valid");
		}
		else {
			System.out.println("welcome");
		}
	}
}
