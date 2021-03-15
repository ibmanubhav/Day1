
public class InheritanceTest extends Inheritance {
	public static void main(String[] args) {
		int bonus = 10000;
		Inheritance obj = new Inheritance();
		System.out.println("Salary + Bonus = "+ obj.salary+ " + " +bonus);
		obj.method(5);
		obj.method();
		obj.method1("Anubhav");
		Inheritance obj1 = new Inheritance(3, "ABCD");
		System.out.println(obj.y + obj.z);

	}

}
