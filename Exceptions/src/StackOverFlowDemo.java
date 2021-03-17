
public class StackOverFlowDemo {
	public static void main(String[] args) {
		callMe();
		
	}

	private static void callMe() {
		// TODO Auto-generated method stub
		callMe();
		System.out.println("Called");
		
	}

}
