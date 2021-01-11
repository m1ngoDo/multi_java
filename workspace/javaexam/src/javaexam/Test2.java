package javaexam;
abstract class 새{
	abstract public void 노래하다() ;
}
class 참새 extends 새{
	public void 노래하다() {
		System.out.println("짹짹");
	}
}

class 오리 extends 새{
	public void 노래하다() {
		System.out.println("꽥꽥");
	}
}

class 비둘기 extends 새{

	@Override
	public void 노래하다() {
		System.out.println("구구");
	}
	
	
}
public class Test2 {
	public static 새 get새(int kind) {
		if(kind == 1)
			return new 오리();
		else if( kind == 2)
			return new 참새();
		else if (kind == 3)
			return new 비둘기();
		return null;
	}
	public static void main(String[] args) {
		새 b =Test2.get새(Integer.parseInt(args[0]));
		b.노래하다();
	}

}
