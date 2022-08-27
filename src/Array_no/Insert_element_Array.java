//Insert element 100 at position 3....don't do this a[2] = 100 because this will delete the value 30 from postion 3...
//we have to shift the 30 further and replace 30 with 100.
package Array_no;

class Insert_element_Array {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		int pos = 3;
		for (int i = a.length - 1; i > pos - 1; i--) {
			a[i] = a[i - 1];
		}
		a[pos - 1] = 100;
		for (int x : a) {
			System.out.print(x + ",");
		}
	}
}
