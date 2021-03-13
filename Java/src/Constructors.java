
public class Constructors {
	int x;
	String y;

	Constructors(int z, String w) {
		x = z;
		y = w;
	}
	
	Constructors(){
		System.out.println("This is Default Constructor");
	}
	public static void main(String[] args) {
		Constructors obj = new Constructors(5, "Ram");
		Constructors obj1 = new Constructors();
		System.out.println(obj.x + obj.y);
	}
	

}
