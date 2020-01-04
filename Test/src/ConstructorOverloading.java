
public class ConstructorOverloading {
int i;
int j;
int k;
ConstructorOverloading(int i, int k){

		System.out.println("hii");
}
ConstructorOverloading(int i, int k, int j){
	
		System.out.println("Hello");
	
}
	public static void main(String[] args) {

		ConstructorOverloading con =new ConstructorOverloading(1,2,3);
		;
	}

}
