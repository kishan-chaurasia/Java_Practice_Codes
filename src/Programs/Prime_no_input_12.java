//Prime no take input from User - no which is divisible by 1 & itself Eg - 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47
package Programs;

import java.util.Scanner;

class Prime_no_input_12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = sc.nextInt();
		int count = 0;
		if (n > 1) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("Prime no");
			} else {
				System.out.println("Not Prime");
			}
		} else {
			System.out.println("Not Prime");
		}

	}
}
