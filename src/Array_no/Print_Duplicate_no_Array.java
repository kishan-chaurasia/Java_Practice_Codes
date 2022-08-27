//Print all the Duplicate values in Array
package Array_no;

class Print_Duplicate_no_Array {

	public static void main(String[] args) {
		int n[] = { 1, 7, 3, 9, 5, 4, 5, 6, 2, 10, 8, 10 };

		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					System.out.println(n[j]);
				}
			}
		}

	}
}
