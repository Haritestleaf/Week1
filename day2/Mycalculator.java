package week1.day2;

public class Mycalculator {

	public static void main(String[] args) {
		Calculator Mycalobj =new Calculator();
		int k = Mycalobj.add();
		int f = Mycalobj.divi();
		int v = Mycalobj.sub();
		int h = Mycalobj.mult();
		
		System.out.println("sum is :" +k);
		System.out.println("sub is :" +v);
		System.out.println("divide is :" +f);
		System.out.println("multi is :" +h);
	}
}
