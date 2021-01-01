public class j24_ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Program starts");

		int[] myArray = { 3, 9, 45, 22, 16 };

		try {
			int result = myArray[1] / 0;
			System.out.println(myArray[1]);

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
			//implementation
			System.out.println(exception);
		} finally {
			//implementation
			System.out.println("finally block is always executed");
		}

		try {
			String name = null;
			System.out.println(name.length());

		} catch (Exception exception) {
			System.out.println(exception);
		}

		System.out.println("Program ends");
	}
}
