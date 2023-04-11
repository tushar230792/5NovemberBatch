package Counstructer;

public class Basic4 {
	
	int a;
	int b;
	int m;
	String name;
	String lastname;
	String velocity;
	
	Basic4() {      //user define constructer without parameter
		
		a=78;
		b=68;
		m=30;
	}
	
	Basic4(int c,int d)   {       // user define constructer with parameter
		
		a=c;
		b=d;
		
	}
	
    Basic4(int c,int d ,int i)   {       // user define constructer with parameter
		
		a=c;
		b=d;
		m=i;
		
    }
    
    
    Basic4 (String Abc ,String testing)  {
    	
    	name =Abc;
    	velocity =testing;  
    }
    	
    	public void test()  {
    		System.out.println(name);
    		System.out.println(velocity);
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
    	
    	 Basic4 g= new Basic4("Tushar","Mankar");	
    	  
    	 g.test();
    	
    }
    
}

    	


