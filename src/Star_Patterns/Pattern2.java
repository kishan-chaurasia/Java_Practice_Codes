package Star_Patterns;

public class Pattern2 {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int k = 0; k <= n-i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}

//* * * * 
//* * *
//* *  
//*
