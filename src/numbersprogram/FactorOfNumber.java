package numbersprogram;

public class FactorOfNumber {
	public static void main(String args[]) {
		int no = 36;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				System.out.print(i + " ");

			}
		}
	}
}
