import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class linkedListDemo {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int i = 0; i < 500; i++) {

			names.add("Ram" + i);
		}
		System.out.println(names);
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int value2 = Integer.valueOf(o2.substring(3));
				int value2 = Integer.valueOf(o2.substring(beginIndex))
				return 0;
			}
			
		});
	}

}
