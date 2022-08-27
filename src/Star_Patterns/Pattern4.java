package Star_Patterns;

public class Pattern4 {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				// Just Removed space after * otherwise entire code is same as pattern 3
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

//   *
//  **
// ***
//****