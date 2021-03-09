
public class Human {
	private String name; // Data encapsulation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.trim().equals("") ) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
	}
	
	private byte age;
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}


}
