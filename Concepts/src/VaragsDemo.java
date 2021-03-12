
public class VaragsDemo {
	public static void main(String[] args) {
		int result = add(2, 3, 4, 5, 6, 7);
		System.out.println(result);

		int result1 = add1(3, 5);
		System.out.println(result1);
	}

	static int add(int... numbers) { // varags
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(numbers[1]);
		return sum;
	}

	static int add1(int a, int b) {
		return a + b;

	}

}
