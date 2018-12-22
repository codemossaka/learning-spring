package ru.godsonpeya.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coatch theCoatch = context.getBean("myCoatch", Coatch.class);
		System.out.println(theCoatch.getDailyWorkout());
		System.out.println(theCoatch.getDailyFortune());
		
		context.close();
	}

}
