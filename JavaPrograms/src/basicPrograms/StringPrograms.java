package basicPrograms;

public class StringPrograms {

	static void ReverseString() {
		String s[] = "Welcome to Java".split(" ");
		String rev = "";

		for (int i = s.length - 1; i >= 0; i--) {
			rev = rev + s[i] + " ";
		}
		System.out.println("Reverse String is:" + rev);
	}

	public static void main(String[] args) {

		ReverseString();
	}

}
