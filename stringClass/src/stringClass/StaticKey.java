package stringClass;

public class StaticKey {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s2.setCount(1);
		s2.setCount(14);
		Student.setCount(20);
		System.out.println(s1.getCount());
		System.out.println(s2.getCount());
		Student.study();
		
	}

}

class Student{
	private static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}
	public static void study() {
		System.out.println("Study");
	}
	
}