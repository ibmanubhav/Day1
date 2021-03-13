
public class FinalKeyword {
	public static void main(String[] args) {
	//	Child c1 = new Child();
	//	c1.m1();
	//	Parent p1 = new Parent();
	//	p1.m1();
		Parent p2 = new Child();
		p2.m1();
	}

}

class Parent{
	//final String name = "Anubhav";
	void m1() {
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	void m1() {
		System.out.println("Child Class");
	}
}