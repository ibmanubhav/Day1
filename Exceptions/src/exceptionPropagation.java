
public class exceptionPropagation {
	public static void main(String[] args) {
		new A().m1();
		
	}

}
class A{
	void m1() {
		try{
			m2();
		} catch(RuntimeException runtimeException) {
			runtimeException.printStackTrace();
			System.out.println("Handled");
		} catch(Exception exception) {
			
		}
		finally {
			System.out.println("always executed");
		}
		
		System.out.println("m1");
		
	}
	void m2() throws Exception{
		System.out.println("m2");
	//	throw new RuntimeException();
	}
}
