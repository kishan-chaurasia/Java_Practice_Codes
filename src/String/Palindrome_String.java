package String;

import java.util.Scanner;

class Palindrome_String {
	public static void main(String[] args) {
		String n, a = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		n = sc.nextLine();
		int len = n.length();
		for (int i = len - 1; i >= 0; i--) {
			a = a + n.charAt(i);
		}
		if (n.equals(a)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
