public class j14_ContinueKeyword {

	public static void main(String[] args) {

		anyLabel: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					continue anyLabel;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
