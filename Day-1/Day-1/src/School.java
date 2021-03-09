
public class School {
	public static void main(String[] args) {
	/*	System.out.println("Hello");
		Student student = new Student();
		student.setAge((byte)10);
		student.setName("Ram");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		student.study();  */
		
// for loop 10 teacher object
/*		for (int i = 0; i <10 ; i++) {
			Teacher teacher = new Teacher("Shyam"+i);
		}
		
		// while, do-while
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}		*/
		printpattern();

	/*	Teacher teacher = new Teacher("Shyam");
		teacher.setName("XYZ");
		teacher.setAge((byte)45);
		teacher.setSubject("Physics");
		teacher.setSalary(50000);
		System.out.println(teacher.getName());
		System.out.println(teacher.getAge());
		System.out.println(teacher.getSubject());
		System.out.println(teacher.getSalary());*/
	}

	private static void printpattern() {
		// TODO Auto-generated method stub
		for(int j=0; j<5; j++) {
			for(int k=0;k<j+1;k++) {
			System.out.print("*");
		}
			System.out.println(" ");}
		for(int l=0;l<4;l--) {
		for (int m=0;m<l+1;m--)	{
			System.out.print("*");
		}
		    System.out.println(" ");
		}
		
		
		
		
		
	}

}

