// Using While Loop -Factorial  of 5 is 1*2*3*4*5 =120 (OR) 5*4*3*2*1 = 120
package Programs;

import java.util.Scanner;

class Factorial_WhileLoop {
	public static void main(String[] args) {
		int n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = sc.nextInt();
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		System.out.println(fact);
	}
}