//Prime no - no which is divisible by 1 & itself Eg - 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47
package Programs;

class Prime_no {
	public static void main(String[] args) {
		int p = 50;

		for (int i = 2; i <= p; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.print(i + ",");
			}

		}

	}
}