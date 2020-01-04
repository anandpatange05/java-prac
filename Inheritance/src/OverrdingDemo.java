class AA{
	
	void show(){
		System.out.println("hiiii");
	}
}
class BB extends AA{
	
	void show(){
		System.out.println("hello");
	}
}
public class OverrdingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA b = new BB();
		b.show();

	}

}
