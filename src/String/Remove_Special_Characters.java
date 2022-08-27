package String;

public class Remove_Special_Characters {

	public static void main(String[] args) {

		String s = "K$i^123^s@%h%a&@5656%^((%*(&n11232#^@*";
		s = s.replaceAll("[^A-Za-z]", "");
		System.out.println(s);
	}
}
