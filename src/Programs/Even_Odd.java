//User will enter no and print whether it is even or odd
package Programs;

import java.util.Scanner;

class Even_Odd {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}
