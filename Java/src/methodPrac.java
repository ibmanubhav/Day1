
public class methodPrac {
	static void methodDemo() {
		System.out.println("Code is Executed");

	}

	static void methodDemo1(String name) {
		System.out.println(name);

	}
	
	static int methodDemo2(int x,  int y) {
		int z = x + y;
		return z ;
	}
	

	public static void main(String[] args) {
		methodDemo();
		methodDemo1("Ram");
		methodDemo1("Shyam");
		methodDemo1("Ramesh");
		//methodDemo2(2, 3);
		System.out.println(methodDemo2(2, 5));
	}

}

