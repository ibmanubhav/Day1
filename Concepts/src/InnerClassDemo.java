
public class InnerClassDemo {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account();
			accounts[i] = account;

		}

	}

}

class Account {
	// private Address address; // can handle only one address
	private Address[] address; // multiple addresses can be handled
	private int number;

	public Account() {
		this.address = new Address[3];
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private class Address {
		private String street;

	}
}
