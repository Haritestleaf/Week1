package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =153;
		int b;
		int c=0;
		int d=a;
		while (a > 0) {
			b = a %10;
			c=c+ b*b*b;
			a=a/10;
		
		}	
		if(c==d) 
			System.out.println("The number " + d +  "  is Amstrong");
		
	
		else 
			System.out.println("it is not");
		
		

}	
	}


