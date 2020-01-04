class Rushikesh{
	int j;
	int i;
	Rushikesh(int i, int j){
		
		this.j=j;
		 this.i=i;
	
	}
}
class Anand extends Rushikesh{
int o;
	Anand(int o){
		super(o, o);
		 
		}
}
public class Abc extends Anand {


	Abc(int o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Anand z = new Abc(10);
	}
}
