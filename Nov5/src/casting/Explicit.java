package casting;

public class Explicit {
	
	public static void main(String[] args) {
		
		double a=130;    // memory size is 8 byte
		System.out.println(a);
		
		int b=(int) a;    //memory size 4 byte
		System.out.println(b);
		
		byte c=(byte)b;    //memory size 1byte
		System.out.println(c);
	}

}
