class AA{
	int id;
	String name;
	String city;
	String coll;
	

	AA(int id, String name,String city) {
		this.id = id;
		this.name = name;
		this.city=city;
	}
	AA(int id,String name,String city,String coll) {
		this(id,name,city);
		this.coll=coll;
	}

	void show() {
		System.out.println(id + " " + name+" "+city);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
