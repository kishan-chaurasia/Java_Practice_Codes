package Star_Patterns;

public class Pattern9_Diamond {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n - i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}

//   * 
//  * * 
// * * * 
//* * * * 
// * * * 
//  * * 
//   * 