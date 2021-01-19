package ioc.exam.tv;

public class GoTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("전원을 켜다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끄다.");
	}

	@Override
	public void volumUp() {
		System.out.println("소리를 높이다.");
		
	}

	@Override
	public void volumDown() {
		System.out.println("소리를 낮추다.");
		
	}	
}

