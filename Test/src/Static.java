
public class Static {
public static int k=10;
Static(int k){
	this.k=k;
}
public static void show() 
{
System.out.println(k);	
}
	public static void main(String[] args) {
		Static n= new Static(10);
		n.show();
	}
}
