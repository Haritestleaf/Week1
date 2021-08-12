package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "moem", r = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			r += x.charAt(i);
		}
		if (r.equals(x)) {
			System.out.println("its a palindrom");
		} else
			System.out.println("its not");

	}
}
