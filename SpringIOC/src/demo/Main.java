package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String []args)
	{
		ClassPathXmlApplicationContext appcontext=new ClassPathXmlApplicationContext("account.xml");
	System.out.println("context class loded");
	
	AccountBean ab=(AccountBean)appcontext.getBean("accountbean");
	
	ab.makeDeposit();
	
	}

}
