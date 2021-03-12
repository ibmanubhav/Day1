
public class Osm {
	public static void main(String[] args) {
		Order o1 = new Order();
		o1.setID(1111);
		o1.setItem("Furniture");
		o1.setItemcode("ABCD");
		
		Customer c1 = new Customer();
		c1.setName("Anubhav");
		c1.setAge(18);
		
		Address a1 = new Address();
		a1.setStreet("Delhi");
		a1.setCity("Delhi");
		a1.setPIN(111111);
		
		System.out.println("Order ID - " +o1.getID() + "is " + o1.getItem()+  "and for this item, code is" + o1.getItemcode() );
		System.out.println("Customer Name is " + c1.getName() + "and age is "+ c1.getAge() );
		System.out.println("Address of Customer is "+ a1.getStreet() +  a1.getCity() +  a1.getPIN());
		

		
		
		
		
	}

}
