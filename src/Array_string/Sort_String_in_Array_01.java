//Sort String in Array in Ascending and Desending order
package Array_string;

class Sort_String_in_Array_01 {
	public static void main(String[] args) {
		String temp;
		String s[] = { "ab", "bc", "hi", "AB", "ef", "fg", "cd", "de", "gh", "BC" , "az" };
		;
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (String x : s) {
			System.out.print(x + ",");
		}

	}
}