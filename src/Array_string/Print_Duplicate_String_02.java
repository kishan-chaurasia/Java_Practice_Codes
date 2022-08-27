package Array_string;

//import java.util.HashSet;

class Print_Duplicate_String_02 {
	public static void main(String[] args) {

		String s[] = { "Csharp", "Python", "C", "Java", "Go", "Java" };
		int len = s.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (s[i].equals(s[j])) {
					System.out.println(s[i]);
				}
			}
		}
	}
}

//Using Collections HashSet
//		HashSet<String> hs = new HashSet<>();
//		for (String z : s) {
//			if (hs.add(z) == false) {
//				System.out.println(z);
//				break;
//			}
//		}