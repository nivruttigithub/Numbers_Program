package numbersprogram;

public class PerfectSquare {
	public static void main(String arg[]) {
		int no = 25;
		if (isPerfectSquare(no)) {
			System.out.println(no + " is a Perfect Square ");
		} else {
			System.out.println(no + " is Not a Perfect Square...!");
		}
	}

	public static boolean isPerfectSquare(int no) {
		if (no < 0) {
			return false;
		}
		int left = 0;
		int right = no;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			int midSq = mid * mid;
			if (midSq == no) {
				return true;
			} else if (midSq < no) {
				left = mid + 1;
			} else if (midSq > no) {
				right = mid - 1;
			}
		}
		return false;
	}
}
