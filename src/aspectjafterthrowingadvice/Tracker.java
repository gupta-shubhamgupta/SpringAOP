package aspectjafterthrowingadvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Tracker {
	@AfterThrowing(
			pointcut ="execution(* Employee.*(..))",
			throwing="error"
			)
	
	public void advice(JoinPoint jp,Throwable error) {
		   System.out.println("Start of Tracker");
	        System.out.println("Method name: "  + jp.getSignature());  
	        System.out.println("Exception is: "+error);  
	        System.out.println("end of Tracker...");  
	}
}
