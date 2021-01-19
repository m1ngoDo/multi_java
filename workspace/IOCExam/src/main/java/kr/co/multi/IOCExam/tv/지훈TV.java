package kr.co.multi.IOCExam.tv;

public class 지훈TV  implements TV{
	public 지훈TV() {
		System.out.println("지훈TV생성!!!");
	}
	boolean power = false;
	int volume = 0;
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME = 0;

	@Override
	public void turnOn() {
		power = true;
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void volumUp() {
		if (volume < MAX_VOLUME) {
			volume++;
			System.out.printf("현재 볼륨은 %d입니다.\n", volume);
		}else 
			System.out.println("볼륨이 최대 볼륨입니다.");
	}

	@Override
	public void volumDown() {
		if (volume > MIN_VOLUME) {
			volume--;
			System.out.printf("현재 볼륨은 %d입니다.\n", volume);
		} else
			System.out.println("볼륨이 최소 볼륨입니다.");
	}

}
