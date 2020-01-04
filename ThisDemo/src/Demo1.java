class A {

	int id;
	String name;
	

	A(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}

}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(10, "abc");
		a.show();

	}

}
