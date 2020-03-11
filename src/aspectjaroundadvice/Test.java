package aspectjaroundadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectjaroundadvice.xml");  
          
        Employee op = (Employee) context.getBean("emp");  
        op.first();  
        op.second();  
    }  
}
