package collection;

public class DEF<G> {
	
	int a;
	
	G b;
	
	public static void main(String[] args) {
		
	DEF <Integer> x=new DEF <Integer>  ();
	
	x.a=68;
	System.out.println(x.a);
	
	x.b=67;
	System.out.println(x.b);
	
	DEF <String> y= new DEF <String> ();
	
	y.b="Automation";
	System.out.println(y.b);
	
	

}
	
}

