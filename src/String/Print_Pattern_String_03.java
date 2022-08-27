//Print String Pattern Descending order - Hello , Hell , Hel , He , H
package String;

class Print_Pattern_String_03 {
	public static void main(String[] args) {

		String s = "HELLO";
		int len = s.length();

		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(s.charAt(k));
			}
			System.out.print("\n");
		}

	}
}

//    H
//   HE
//  HEL
// HELL
//HELLO