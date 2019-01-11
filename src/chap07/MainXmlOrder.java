package chap07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlOrder {

	public static void main(String[] args) { //cacheaspect.java, aoporder.xml
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap07/aopOrder.xml");
		
		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		impeCal.factorial(3);
		impeCal.factorial(5);
		impeCal.factorial(5);

	}

}
