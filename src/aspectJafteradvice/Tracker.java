package aspectJafteradvice;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.After;  
import org.aspectj.lang.annotation.Pointcut;  
  
@Aspect  
public class Tracker{  
    @Pointcut("execution(* Operation.*(..))")  
    public void k(){}  
      
    @After("k()")  
    public void myadvice(JoinPoint jp)  
    {  
        System.out.println("Tracker");   
    }  
}  