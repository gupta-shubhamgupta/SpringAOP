package aspectJbeforeadvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Tracker {
	@Pointcut("execution(* Employee.*(..))")
	public void k(){}
	
	@Before("k()")
	
	public void advice(JoinPoint jp){
		System.out.println("Tracker");
	}
	

}
