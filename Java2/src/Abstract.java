
abstract public class Abstract {
	abstract void Shape();
	abstract void m1();
	void m2() {
		System.out.println("this is m2");
	}
}
class Test extends Abstract{

	@Override
	void Shape() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle has four Sides");
		
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is m1");

		
	}
	
	
}
class main1 {
	public static void main(String[] args) {
		Test obj = new Test(); 
		
	}
}