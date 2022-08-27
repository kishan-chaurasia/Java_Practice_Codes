//Swap 2 no 
package Programs;

import java.util.Scanner;

class Swap_2_No {
	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of a =");
		a = sc.nextInt();
		System.out.println("Value of b =");
		b = sc.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped a = " + a);
		System.out.println("Swapped b = " + b);
	}
}
