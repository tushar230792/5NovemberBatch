package AbstractEncapsuleGenralies;

public class Encapsulation {
	
	private int a=50;     //declare data member (variable) as private
	
	private int b=50;
	
	Encapsulation ()   {
		
		a=80;
		b=65;
	}
	
	Encapsulation ( int c,int d)   {
	
	a=c;
	
	b=d;
	
	}
	
	public void demo()   {
		
		int c=a+b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Encapsulation x=new Encapsulation ();
		
		x.demo();
		
	}
	
	

}
