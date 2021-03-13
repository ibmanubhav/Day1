
public class DefaultCons {
	int id;
	String name;

	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects
		DefaultCons s1 = new DefaultCons();
		DefaultCons s2 = new DefaultCons();
		// displaying values of the object
		s1.display();
		s2.display();
	}
}
// not creating any constructor so compiler provides you a default constructor Here 0 and null values are provided by default constructor