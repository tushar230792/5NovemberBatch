package method;

public class CALLABC1 extends ABC1 {
	

public void Rest()     {
	System.out.println("implemented method");
}

 public  void test()     {
	System.out.println("test method reimplemented");
}

public static void main(String[] args) {
	
	CALLABC1 x=new CALLABC1();
	
	x.Rest();
	x.test();
	
	ABC1 y= new CALLABC1();
	y.test();
	y.Rest();
}
	
}
  