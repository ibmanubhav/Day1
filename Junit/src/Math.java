
public class Math {
	int add(int... numbers){
		int result = 0;
		int counter = 0;
		while (counter<numbers.length) {
			result+=numbers[counter++];
			
		}
		return result;
	}

}
