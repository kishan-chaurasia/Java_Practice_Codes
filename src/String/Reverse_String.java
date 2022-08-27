package String;

import java.util.Scanner;

class Reverse_String {
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String =");
		original = sc.nextLine();
		int len = original.length();

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
	}
}