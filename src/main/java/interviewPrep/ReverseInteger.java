package interviewPrep;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 123456789;
		int rem = 0;
		int num = 0;
		String str = "";
		do {
			rem = number % 10;
			num = number / 10;
			str = str + rem;
			number = num;
			rem = 0;
		} while (num > 0);
		System.out.println(str);
	}

	public int reverseNum(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
}
