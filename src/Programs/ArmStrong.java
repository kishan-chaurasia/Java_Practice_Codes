//ArmStrong no - 153,370,371,407   1*1*1 + 5*5*5 + 3*3*3 = 153
package Programs;

import java.util.Scanner;

class ArmStrong {
	public static void main(String[] args) {
		int r, result = 0, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		k = n;
		while (n > 0) {
			r = n % 10;
			result = result + r * r * r;
			n = n / 10;
		}
		if (k == result) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not ArmStrong");
		}

	}
}
