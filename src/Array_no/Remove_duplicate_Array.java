//Remove Duplicate element From Array - i have used HashSet which is in Java Collection Framework because HashSet do not contain duplicate values.
package Array_no;

import java.util.HashSet;

class Remove_duplicate_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7 };

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (int x : hs) {
			System.out.println(x + " ");
		}
	}
}