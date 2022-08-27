//Print All Missing no from Sorted Array...This Code will only work with Sorted and Unique Values.
package Array_no;

class Print_all_Missing_no_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 6, 7, 10, 11, 20 };
		int len = a.length;

		for (int i = 0; i < len - 1; i++) {
			int sum = a[i + 1] - a[i];
			if (sum > 1) {
				for (int j = a[i] + 1; j < a[i + 1]; j++) {
					System.out.print(j + " , ");
				}
			}
		}
	}
}
