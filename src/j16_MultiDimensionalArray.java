public class j16_MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] myArray = {
				{2, 45, 6, 32},
				{4, 65, 34},
				{7, 8, 12, 5}
		};

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}

		// Total

		int sum = 0;
		for (int[] aMyArray: myArray) {
			for (int anMyArray: aMyArray) {
				sum +=  anMyArray;
			}
		}

		System.out.println("Sum is: " + sum);
	}
}
