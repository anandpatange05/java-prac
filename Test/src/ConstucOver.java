
public class ConstucOver {
	int i;
	int j;
	int k;
	int a;
	void display() {
		System.out.println("method using this");
	}
	void show() {
		this.display();
		System.out.println("my method");
	}
	
	public static void main(String[] args) {
		ConstucOver v=new ConstucOver();
		v.show();
	}

}
