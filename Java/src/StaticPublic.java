
public class StaticPublic {
	static void staticMethod() {
		System.out.println("This is Static Method");
	}
	public void publicMethod() {
		System.out.println("This is Public method");
	}
	public static void main(String[] args) {
		staticMethod(); // Static method can be called without creating object.
		StaticPublic obj = new StaticPublic();
		obj.publicMethod(); // Public method cannot be called without creating object.
	}

}



