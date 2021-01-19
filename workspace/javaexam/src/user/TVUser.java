package user;

import ioc.exam.tv.TV;
import ioc.exam.tv.TVFactory;

//import ioc.exam.tv.민경TV;
//import ioc.exam.tv.혜인TV;

public class TVUser {

	public static void main(String[] args) {
//		민경TV tv = new 민경TV();
//		tv.turnon();
//		tv.volumeup();
//		tv.volumedown();
//		tv.turnoff();
//		
//		혜인TV tv = new 혜인TV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.voumeDown();
//		tv.powerOff();
		
//		TV tv = new /* GoTV(); */ 지훈TV();
		TV tv = TVFactory.getTV(args[0]);
		
		tv.turnOn();
		tv.volumUp();
		tv.volumDown();
		tv.turnOff();
		
		
	}

}
