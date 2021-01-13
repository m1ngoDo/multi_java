package exam;
interface A{
	
}
class Parent{
	int i = 5;
	public int getI() {
		return i;
	}
}

class Child extends Parent implements A{
	int i = 10;
	public int getI() {
		return i;
	}
	public void print() {
		System.out.println("나는 Child 입니다.^^");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent p2 = new Child();
		((Child)p2).print();
		if(p instanceof Child)
			((Child)p).print();
		
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Parent);
		
		System.out.println(p2 instanceof Child);
		
		A a = new Child();
		System.out.println(p2 instanceof A);
		
		Object obj = new Parent();
		obj = p2;
		obj = a;
		
	
	}

}
