public class Osm {
	public static void main(String[] args, STATUS DELIVERED) {
		Customer c1 = new Customer();
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
