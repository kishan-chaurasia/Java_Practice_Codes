//Print String Pattern Descending order - Hello , Hell , Hel , He , H
package String;

class Print_Pattern_String_02 {
	public static void main(String[] args) {

		String str = "HELLO";
		int len = str.length();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

		/*
		 * OR - By using substring(start_index , end_index); for (int j=s.length() ; j>0
		 * ; j--) { System.out.println(s.substring(0,j)); }
		 */
	}
}

//HELLO
//HELL
//HEL
//HE
//H
