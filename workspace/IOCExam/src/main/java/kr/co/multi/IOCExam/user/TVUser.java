package kr.co.multi.IOCExam.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.co.multi.IOCExam.tv.TV;

public class TVUser {
	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("ApplicationContext 생성후!!");
		
		TV tv = factory.getBean("g",TV.class);

		tv.turnOn();
		tv.volumUp();
		tv.volumDown();
		tv.turnOff();
	}
}
