package aspectjafterthrowingadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("aspectjafterthrowingadvice.xml");  
        Employee em = (Employee) context.getBean("emp");  
        
        try {
			em.validate(20);
		} catch (Exception e) {
			
			System.out.println(e);
		}
        try {
			em.validate(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
