//Count Even & Odd no 
package Programs;

class Count_Even_Odd {
	public static void main(String[] args) {

		int n = 3495676;
		int Even_Count = 0, Odd_Count = 0;
		while (n > 0) {
			int remainder = n % 10;
			if (remainder % 2 == 0) {
				Even_Count++;
			} else {
				Odd_Count++;
			}
			n = n / 10;
		}
		System.out.println("Even Number Count = " + Even_Count);
		System.out.println("Odd Number Count = " + Odd_Count);
	}

}
