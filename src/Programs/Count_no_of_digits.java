//Count number of digits
package Programs;

class Count_no_of_digits {

	public static void main(String[] args) {
		int n = 45254;
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		System.out.println("No of Digits are = " + count);

	}
}
