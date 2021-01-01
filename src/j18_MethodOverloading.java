public class j18_MethodOverloading {

	public static void main(String[] args) {

		add();
		add(1.2f, 3.4f);
	}

	private static void add() {

		int sum = 3 + 4;
		System.out.println(sum);
	}

	private static void add(float a, float b) {
		double sum = a + b;
		System.out.println(sum);
	}
}
