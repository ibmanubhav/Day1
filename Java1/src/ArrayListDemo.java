import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Maruti");
		System.out.println(cars);
		cars.remove(1);
		System.out.println(cars);
		cars.add("Tata");
		for (String string : cars) {
			System.out.println(string);
			
		}
	}
	

}
