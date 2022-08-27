//Palindrome no : - 101, 111, 121,  202, 212, 303, 313, 323 
package Programs;

import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		int n, P, remainder, reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		P = n;
		while (n > 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n = n / 10;
		}
		if (P == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
