package Counstructer;

public class Basic2 {
	
	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	Basic2() {      //user define constructer without parameter
		
		a=78;
		b=68;
		
	}
	
	Basic2(int c,int d)   {       // user define constructer with parameter
		
		a=c;
		b=d;
		
	}
	
    Basic2(int c,int d ,int i)   {       // user define constructer with parameter
		
		a=c;
		b=d;
		m=i;
		
    }

public void addition ()   {   // non static method
	System.out.println(m+a+b);
}

public static void main(String[]  args)  {
	
	Basic2 x= new Basic2();
	
	x.addition();
	
Basic2 y= new Basic2(50,60);
	
	y.addition();
	
Basic2 z= new Basic2(10,20,30);
	
	z.addition();
	 
	
}
	
}
