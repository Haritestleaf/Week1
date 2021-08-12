package week1.day2;

public class Calculator {
	
	
	
	public int sub() {
		int x=11; 
		int y =8;
		int z=x-y;
		return z;
		
	}
	public int mult() {
		int i=7; 
		int j =8;
		int k =i*j;
		return k;
		
	}
	public int divi() {
		int m=40; 
		int n =5;
		int o =m/n;
		return o;
		
	}
	

	public int add() {
		int a=7; 
		int b =8;
		int c;
		c=a+b;
		return c ;
		
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		int s = obj.add();
		System.out.println("sum is :" +s);
		
		
		

}
}

