package stringClass;

public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study();
		s1.study(2);
		s1.study(2,"Java");

		
	}

}
// Conditions are same method name, different number and types of argument, access to anything
class Student1{
	public void study(int duration, String subject) {
		System.out.println("study for "+ duration + " Hours "+ subject);
	}
	
	public void study(int duration) {
		System.out.println("Study for " + duration + " Hours");
	}
	public void study() {
		System.out.println("Study ");
	}
	
}