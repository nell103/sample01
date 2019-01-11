package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap02/applicationContext.xml");
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("������");
		System.out.println(msg);
		ctx.close();

	}

}
