package aspectJafterreturningadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectJafterreturningadvice.xml");  
        Employee e = (Employee) context.getBean("emp");  
        
        System.out.println(e.first());  
        
        System.out.println(e.second());  
    }  
}
