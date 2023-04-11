package AbstractEncapsuleGenralies;

public class Testcar {
	
	public static void main(String[] args) {
		
		System.out.println("********specification of suzuki******");
		
		suzuki x=new suzuki();
		x.AC();
		x.Musicsystem();
		x.SUV();
		x.coating();
		
		System.out.println("********specification of Hyundai******");
		
		Hyundai y=new Hyundai();
		y.AC();
		y.Musicsystem();
		y.SUV();
		
		System.out.println("********specification of Tata******");
		
		Tata z=new Tata();
		z.AC();
		z.Musicsystem();
		z.SUV();
		z.coating();
		
		
		
	}

}
