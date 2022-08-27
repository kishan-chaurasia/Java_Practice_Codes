package Star_Patterns;

public class Pattern5_Pyramid_Reverse {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n - i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}

//* * * * 
// * * *
//  * *
//   *
