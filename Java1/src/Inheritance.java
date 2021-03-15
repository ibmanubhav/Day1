
public class Inheritance {
	int y;
	String z;
	int salary = 40000;

	Inheritance(int a, String b) {
		y = a;
		z = b;

	}

	Inheritance() {
		System.out.println("Hello");

	}

	static void method() {
		System.out.println("Beep");
	}

	public void method1(String name) {
		System.out.println(name);

	}

	int method(int x) {
		System.out.println(x);
		return x;
	}

}
