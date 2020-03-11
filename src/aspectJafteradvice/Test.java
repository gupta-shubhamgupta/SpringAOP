package aspectJafteradvice;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test{  
    public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectJafteradvice.xml");  
        Emplyoee e = (Emplyoee) context.getBean("emp");  
          
        e.first();  
        e.fsecond();  
        e.third();  
    }  
}  