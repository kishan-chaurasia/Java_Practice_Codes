//find 2nd Largest number in Array and just change this if(a[i] < a[j]) to this --(a[i] > a[j]) for 2nd smallest value in Array.
package Array_no;

class Find_2nd_largest_no_Array {
	public static void main(String[] args) {

		int a[] = { 200, 60, 10, 14, 7, 5, 1, 500, 19, 50, 100, 400, 300 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
	}
}