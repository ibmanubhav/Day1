import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		int a=1;
		Integer b=a; //autoboxing
		Float f = 45.56F;
		Double d = 23.4;
		System.out.println(d.compareTo(19.6));
		System.out.println(d.compareTo(33.6));
		double primitiveDouble = d; // auto unboxing
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(56);
		
	}

}
