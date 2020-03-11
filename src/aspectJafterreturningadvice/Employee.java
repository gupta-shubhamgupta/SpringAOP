package aspectJafterreturningadvice;

public class Employee {
	public int first(){
		System.out.println("first method invoked");
		return 2;
		}  
    public int second(){
    	System.out.println("second method invoked");
    	return 3;
    	}
}
