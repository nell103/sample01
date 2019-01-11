package chap07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import temp.JavaConfig;

public class MainJavaAspect { //javaconfig.java, exetimeaspect2.java
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact);
		
	}

}
