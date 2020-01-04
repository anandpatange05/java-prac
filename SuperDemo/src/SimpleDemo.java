class A {
	void show() {
		System.out.println("hiiii");
	}
	int a=20;
}

class B extends A {
	
	int a = 10;
	void show() {
		System.out.println("hello");
	}

	void talk() {
		System.out.println("welcome");
		show();
		super.show();
		System.out.println(a);
		System.out.println(super.a);
	}
}

public class SimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.talk();

	}

}
