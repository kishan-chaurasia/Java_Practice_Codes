package Star_Patterns;

public class Pattern7 {

	public static void main(String[] args) {

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(k + " ");
			}

			System.out.print("\n");
		}
	}
}

//1 2 3 4 5 6 
// 2 3 4 5 6 
//  3 4 5 6 
//   4 5 6 
//    5 6 
//     6 