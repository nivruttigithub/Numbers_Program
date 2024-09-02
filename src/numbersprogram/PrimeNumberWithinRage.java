package numbersprogram;

public class PrimeNumberWithinRage {
	public static void main(String args[]) {
		int start = 1;
		int end = 10;
		System.out.println("Prime Number Between " + start + " and " + end + " is : ");
		printPrimeNum(start, end);
	}

	public static void printPrimeNum(int start, int end) {
		for (int num = start; num <= end; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
