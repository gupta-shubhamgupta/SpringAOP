package aspectJbeforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args){ 
		 ApplicationContext con=new ClassPathXmlApplicationContext("aspectJbeforeadvice.xml");
		 
		 Employee em=(Employee)con.getBean("emp");
		 
		 em.first();
		 em.fsecond();
		 em.third();
	 }

}
