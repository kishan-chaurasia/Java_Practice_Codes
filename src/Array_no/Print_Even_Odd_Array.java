//Print Even & Odd no from Array and print Count & Sum of Even & odd No
package Array_no;

import java.util.ArrayList;

class Print_Even_Odd_Array {
	public static void main(String[] args) {
		int n[] = { 6, 65, 9, 4, 2, 6, 4, 87, 96, 2, 3, 13, 1, 6, 4, 8, 7, 5, 19, 3, 6, 4, 100 };
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();

		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 == 0) {
				a1.add(n[i]);
			} else {
				a2.add(n[i]);
			}
		}
		int evenSum = 0;
		System.out.print("Even no = ");
		for (int x : a1) {
			evenSum = evenSum + x;
			System.out.print(x + ",");
		}
		System.out.print("\n");
		System.out.println("Total Even Count =" + a1.size());
		System.out.println("Total Sum =" + evenSum);

		int oddSum = 0;
		System.out.print("\n");
		System.out.print("Odd no = ");
		for (int y : a2) {
			oddSum = oddSum + y;
			System.out.print(y + ",");
		}
		System.out.print("\n");
		System.out.println("Total Odd Count =" + a2.size());
		System.out.println("Total Sum =" + oddSum);

	}
}
