
public class Teacher extends Human {
//	private String name;
//	private byte age;
	private String subject;
	private float salary;
	
	
	public Teacher(String name) { // constructor
		// TODO Auto-generated constructor stub
		setName(name);
		
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
/*	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}*/
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	



	}

