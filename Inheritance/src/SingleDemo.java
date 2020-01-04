class A {

	void show() {
		System.out.println("hii");
	}

}

class B extends A
{
	void talk() {
		System.out.println("hello");
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.talk();
		b.show();

	}

}
