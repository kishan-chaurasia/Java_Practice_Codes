//Print count of total no of words present in a string
package String;

class Print_Count_of_words_in_String {
	public static void main(String[] args) {

		String str = "i love my Hindustan";

		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}

// using String Split method
//String s[] = str.split(" ");
//System.out.println(s.length);