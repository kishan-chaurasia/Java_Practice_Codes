//Check 2 Arrays are Equal or Not
package Array_no;

//import java.util.Arrays;
public class Check_Arrays_Equal {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4 };
		boolean status = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}
}

/*
 * OR Directly using Arrays method
 * 
 * Boolean flag = Arrays.equals(a,b); if(flag==true){
 * System.out.println("Equal"); }else{ System.out.println("not equal"); }
 */