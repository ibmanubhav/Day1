
public class Address {
	private String Hno;
	public String getHno() {
		return Hno;
	}
	public void setHno(String hno) {
		Hno = hno;
	}
	private String City;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	private String State;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	private String PIN;
	public Address(String hno, String city, String state, String pIN) {
		super();
		Hno = hno;
		City = city;
		State = state;
		PIN = pIN;
	}
	public String getPIN() {
		return PIN;
	}
	public void setPIN(String pIN) {
		PIN = pIN;
	}
	
	
	
	

}
