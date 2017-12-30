package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class UseSpringBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		SpringTest test1 = (SpringTest) context.getBean("springTestClass");
		test1.setSpringVersion("3.1");
		test1.setReleaseDate("12-20-2014");
		test1.printSpringInfo();
	}

}
