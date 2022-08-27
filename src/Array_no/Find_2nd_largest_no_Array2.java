//find 2nd Largest number in Array when there are duplicate values present in Array. 
package Array_no;

class Find_2nd_largest_no_Array2 {
	public static void main(String[] args) {

		int a[] = { 20, 10, 5, 10, 5, 20, 1, 20 };
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
		int num = a[0];
		for (int i = 1; i < a.length; i++) {
			if (num != a[i]) {
				num = a[i];
				break;
			}
		}
		for (int no : a) {
			System.out.println(no);
		}
		System.out.println("2nd largest :- " + num);
	}
}