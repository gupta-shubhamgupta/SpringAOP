package aspectJafterreturningadvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Tracker {
	@AfterReturning(
			pointcut="execution(* Employee.*(..))",
			returning="result"
			)
	public void advice(JoinPoint jp,Object result) {
		  
        System.out.println("Method name: "  + jp.getSignature());  
        System.out.println("Result in tracker: "+result);  
          
	}

}
