package ioc.exam.tv;


public class TVFactory {
	public static TV getTV(String tvName) {
		TV tv = null;
		if("G".equalsIgnoreCase(tvName))
			tv = new GoTV();
		else if("J".equalsIgnoreCase(tvName))
			tv = new 지훈TV();
		
		return tv;
	}
}
