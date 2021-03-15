
public class Encapsulation {
	private int x ;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
class Test{
public static void main(String[] args) {
	Encapsulation obj = new Encapsulation();
	obj.setX(5);
	System.out.println(obj.getX());
}
	
}