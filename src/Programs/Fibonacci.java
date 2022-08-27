//Fibonacci series.. (The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, 
//starting with 0, and 1. 
//The Fibonacci Sequence: 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ,89.....)
package Programs;

import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of times : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + "  ");
		}
	}
}