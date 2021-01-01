public class j01_ArithmeticOperators {

	public static void main(String[] args) {

		// From left to right, and Parenthesis > Multiplication o Division > Addition o Subtraction
		int result =  3 + 1 - 7 * 5 % 3 / 2;

		System.out.println(result);
		// => 3 + 1 - 7 * 5 % 3 / 2
		// => 3 + 1 - 35 % 3 / 2
		// => 3 + 1 - 2 / 2
		// => 3 + 1 - 1
		// => 4 - 1
		// => 3
	}
}
