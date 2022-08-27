// Using For Loop -Factorial  of 5 is 1*2*3*4*5 =120 (OR) 5*4*3*2*1 = 120
package Programs;

import java.util.Scanner;

class Factorial_ForLoop {
	public static void main(String[] args) {
		int n, i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
