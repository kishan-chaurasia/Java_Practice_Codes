//Print only 1st Duplicate number in Array.
// here 1st Duplicate is 10 not 5
package Array_no;

import java.util.ArrayList;

class Print_1st_Duplicate_no_Array {
	public static void main(String[] args) {

		int a[] = { 1, 5, 10, 9, 7, 10, 2, 5, 8, 9 };
		int len = a.length;
		ArrayList<Integer> duplicateNoIndex = new ArrayList<>();
		int assumeMinNo;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					duplicateNoIndex.add(j);
				}
			}
		}
		assumeMinNo = duplicateNoIndex.get(0);
		for (int j = 1; j < duplicateNoIndex.size(); j++) {
			if (assumeMinNo > duplicateNoIndex.get(j)) {
				assumeMinNo = duplicateNoIndex.get(j);
			}
		}
		System.out.println("First Repeating no is = " + a[assumeMinNo]);
	}
}
