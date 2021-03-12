
public class ArrayDemo {
	public static void main(String[] args) {
		int[] scores = new int[10]; // objects
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);

		}
		int[] numbers = { 1, 2, 3, 4 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
		boolean[] booleans = { true, false };
		for (boolean value : booleans) { // foreach Loop
			System.out.println(value);
		}
		String[] names = new String[10]; // create an array object with capacity = 10, no string object created here
		for (String name : names) {
			name = new String("Ram"); // goes to heap, 10 objects
			name = "Ram"; // string pool, only 1 object is created
			System.out.println(names);
		}
		Student[] students = new Student[10]; // array of 10 students
		for (int i = 0; i < students.length; i++) {
			Student student = new Student("Ram" + i);
			students[i] = student;
			if(i==5)
				break;

		}
		System.out.println(students.length); // number of elements in array
		for (int j = 0; j < students.length; j++) {
		System.out.println(students[j].getName());
		}
	}

}

class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

}
