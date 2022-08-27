package String;

//String most used Methods
class String_Methods {
	public static void main(String[] args) {

		String str = "Hello world JAVA String methods Hello ";
		String str2 = "hello world JAVA String methods Hello ";

		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.print("\n");

		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf('o', str.indexOf('o') + 1));
		System.out.println(str.indexOf("JAVA"));
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.lastIndexOf("Hello"));
		System.out.print("\n");

		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.substring(1, 10));
		System.out.print("\n");

		String s = "     Hello Namaste   ";
		String s2 = "25-06-2025";
		String s3 = "%$21%$Good&%$Night&%34&%00";
		System.out.println(s.trim());
		System.out.println(s2.replace("-", "/"));
		System.out.println(s3.replaceAll("[^A-za-z]", ""));
		System.out.print("\n");

		System.out.println(s.concat(s2));
		System.out.println(s.concat("Bye bye"));
		System.out.print("\n");

		String a[] = str.split("String");
		for (String z : a) {
			System.out.println(z);
		}
	}
}