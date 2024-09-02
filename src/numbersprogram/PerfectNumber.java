package numbersprogram;

public class PerfectNumber {
	public static void main(String args[]) {
		int no = 6;
		int result = 0;
		for (int i = 1; i <= no/2; i++) {
			if (no % i == 0) {
				result = result + i;
			}
		}
		if (result == no) {
			System.out.println(no + " is a Perfect NUmber...");
		} else {
			System.out.println(no + " is Not a Perfect Number...!");
		}
	}
}
