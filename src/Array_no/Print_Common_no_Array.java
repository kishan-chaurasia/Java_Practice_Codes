//Print Common Elements From both Array
package Array_no;

import java.util.HashSet;

class Print_Common_no_Array {
	public static void main(String[] args) {
		int a[] = { 6, 65, 10, 200, 8, 6 };
		int b[] = { 2, 6, 4, 6, 8, 200 };

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					hs.add(a[i]);
					break;
				}
			}
		}
		for (int x : hs) {
			System.out.print(x + ",");
		}

	}
}
