//Print no of counts a word is repeating in a String
package String;

import java.util.HashMap;
import java.util.Set;

class Print_Count_of_duplicate_words_in_String {
	public static void main(String[] args) {

		String str = "People love java language and jAVA coffee LOVE Java people";

		String s[] = str.toLowerCase().split(" ");

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String word : s) {
			if (hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word) + 1);
			} else {
				hashMap.put(word, 1);
			}
		}
		Set<String> set = hashMap.keySet();

		for (String key : set) {
			if (hashMap.get(key) > 1) {
				System.out.println(key + " : " + hashMap.get(key));
			}
		}

	}
}