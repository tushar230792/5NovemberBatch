package inheritance;

public class Super1 extends Super123     {   // int a=12;

int a=15;      // global variable

public void test ()       {
	
	int a=67;      //local variable 
	
	System.out.println(a);        //local variable from same class
	System.out.println(this.a);    //global varoable from same class
	System.out.println(super.a);   //global variable from super class123
	
}

public static void main(String[] args) {
	
	Super1 z=new Super1();
	z.test();
	
}

}
	








