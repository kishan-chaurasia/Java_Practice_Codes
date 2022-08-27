package String;

class Swap_2_String_without_3rd_var {
	public static void main(String[] args) {

		String str = "Hello";
		String str2 = "Namaste";

		str = str + str2;
		str2 = str.substring(0, str.length() - str2.length());
		str = str.substring(str2.length());
		System.out.println(str);
		System.out.println(str2);
	}
}