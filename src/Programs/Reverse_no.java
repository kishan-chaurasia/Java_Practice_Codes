//Reverse the number
package Programs;

import java.util.Scanner;

class Reverse_no {
	public static void main(String[] args) {
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		a = sc.nextInt();
		while (a > 0) {
			b = a % 10;
			c = c * 10 + b;
			a = a / 10;
		}
		System.out.println("Reversed a = " + c);
	}
}