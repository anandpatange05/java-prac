
public class DefaultToPara {
	int a=10;
//	void show() {
//		System.out.println(a);
//		}
	DefaultToPara(){
		System.out.println(a);	
	}
	DefaultToPara(int a){
		this.a=a;
		DefaultToPara n= new DefaultToPara();
	}
	public static void main(String[] args) {
		DefaultToPara n= new DefaultToPara(10);
		
	}

}
