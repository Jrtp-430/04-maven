package AshokIt.git;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/nt/config/BeanConfig.xml");
		Atm atm=context.getBean(Atm.class);
		String status= atm.withdraw();
		System.out.println(status);
		
		
	}

}
