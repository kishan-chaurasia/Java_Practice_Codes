//Print String Pattern Ascending order - H , He , Hel , Hell , Hello
package String;

class Print_Pattern_String_01 {
	public static void main(String[] args) {

		String s = "HELLO";
		int len = s.length();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}

		/*
		 * OR - By using substring(start_index , last_index); for (int j=1 ;
		 * j<=s.length(); j++) { System.out.println(s.substring(0,j)); }
		 */
	}
}

//H
//HE
//HEL
//HELL
//HELLO
