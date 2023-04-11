package Counstructer;

public class Localglobal2 {
	
	int a=30; // global variable
	
	public void Test() {
		
		int b=78;  // Local variable
		int d=87;
		System.out.println(d); // calling local variable
		System.out.println(b); // calling local variable
		System.out.println(a); // calling global variable
		
	}
	
	public void demo() {
		int c =90; // Local variable
		int e=70;
		System.out.println(e); // calling local variable
		System.out.println(c);// calling local variable
		
		System.out.println(a);// calling global variable
		
		// System.out.println(b); // local variable from another method cant be call
	}
	
	public static void main(String[] args) {
		
		Localglobal2 x = new Localglobal2() ;
		
		x.Test();
		x.demo();
		
	}
}

