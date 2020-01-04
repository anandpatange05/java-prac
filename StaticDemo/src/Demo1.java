class B

{	
	int id;
	String name;
	static  String city="Pune";
	
	B(int i,String n){
		id=i;
		name=n;
		
	}
	void show(){
		System.out.println(id +" "+name+" "+city);
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(1,"A");
		B b1 = new B(2,"A");
		B b2 = new B(3,"A");
		b.show();
		b1.show();
		b2.show();
		
		

	}

}
