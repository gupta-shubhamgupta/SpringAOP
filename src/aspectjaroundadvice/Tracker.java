 package aspectjaroundadvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Tracker {
	@Pointcut("execution(* Employee.*(..))")
	public void k() {}
	
	@Around("k()")
	
	public Object advice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("Before calling actual method");  
        Object obj=pjp.proceed();  
        System.out.println("After calling actual method");  
        return obj;  
	}
}
