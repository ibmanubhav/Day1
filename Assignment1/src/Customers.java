public class Customers {
	private String customername;

	public Customers() {

	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	private String customeraddress;

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	private String customerobject;

	public String getCustomerobject() {
		return customerobject;
	}

	public void setCustomerobject(String customerobject) {
		this.customerobject = customerobject;
	}

}

enum STATUS {
	DELIVERED, UNDELIVERED
}

class Datawarehouse extends Customers {
	public Datawarehouse() {
		 super();
		// TODO Auto-generated constructor stub
	}

	private String ordername;

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	private STATUS status = STATUS.DELIVERED;

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

}

public class Osm {
	public static void main(String[] args, STATUS DELIVERED) {
		Customers c1 = new Customers();
		c1.setCustomername("Anubhav");
		System.out.println("Customer Name -" + c1.getCustomername());
		c1.setCustomerobject("Furniture");
		System.out.println("Customer Objects -" + c1.getCustomerobject());
		c1.setCustomeraddress("Delhi");
		System.out.println("Customer Address -" + c1.getCustomeraddress());

		Datawarehouse o1 = new Datawarehouse();
		o1.setOrdername("ABCD");
		System.out.println("Order is " + o1.getOrdername());
		o1.setStatus(STATUS.DELIVERED);
		
		
		

	}

}
