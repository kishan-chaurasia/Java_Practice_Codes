//Print the Missing no from Sorted Array...This Code will only work with Sorted and Unique Values.
package Array_no;

class Print_Missing_no_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };

		int expected_len = a.length + 1;
		// Formula to get Total sum of sorted n numbers
		int total_sum = (expected_len * (expected_len + 1) / 2);
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println("Missing no = " + (total_sum - sum));
	}
}
