//find Largest number in Array and just change this if(max < a[i]) to this --(max > a[i]) for smallest value in Array
package Array_no;

class find_largest_no_Array {
	public static void main(String[] args) {
		int a[] = { 200, 10, 14, 7, 5, 1, 400 };

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}