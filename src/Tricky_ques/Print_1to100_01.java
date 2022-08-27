//Print 1-100 without using any numbers.
package Tricky_ques;

class Print_1to100_01 {

	public static void main(String[] args) {

		String s = "Programmin";
		String s1 = "b";
		int one = s1.length();
		int hundred = s.length() * s.length();
		for (int i = one; i <= hundred; i++) {
			System.out.print(i + ",");
		}
		// Alternate solution - using ASCII value i.e a=97 , b=98 , c=99.....
		// for(int j='e'-'d' ; j<='d' ; j++)
		// {
		// System.out.print(j+",");
		// }
	}
}