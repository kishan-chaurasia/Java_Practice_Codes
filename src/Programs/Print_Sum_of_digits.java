//Print Sum of Digits
package Programs;

class Print_Sum_of_digits {
	public static void main(String[] args) {

		int n = 642198;
		int sum = 0, remainder;
		while (n > 0) {
			remainder = n % 10;
			sum = sum + remainder;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
