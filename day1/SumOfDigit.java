package week1.day1;

public class SumOfDigit {
	public static void main(String[] args) {
		int a = 123;
		int b = 0;
		while(a>0) {
			int c=a % 10;
			b=b+c;
			a= a/10;
		
		}
		System.out.println(b);
		
	}

}
