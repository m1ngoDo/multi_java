package kr.co.multi.IOCExam.tv;

public class GoTV implements TV {
	public GoTV() {
		System.out.println("goTV생성!!");
	}
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

