package practicearray;

public class swappingArray {
	
	public static void main(String[] args) {
		
		int a[] = {21,22,23,24,25,26};
		
		for(int i=0; i<=a.length-1; i++)  {
		
		System.out.println(a[i]);
		}
		
		// a[0]=a[5] last index -0
		// a[1]=a[4] last index -1
		// a[2]=a[3] last index -2
		
		for(int i=0; i<(a.length/2); i++)   {
			
			int c;
			
			c=a[i];   //21  c=21;
		  a[i]=a[(a.length-1)-i];      // a[0]=a[6-1)-0]=a[5];
			a[(a.length-1)-i]=c;
			
		//	c=a[i] //22 c=22;
		//	a[i]=a[(a.length-1)-i];	  a[1]=a[6-1)-1]=a[4];	
		//	a[(a.length-1)-i]=c
			
			
			//	c=a[i] //23 c=23;
			//	a[i]=a[(a.length-1)-i];	  a[2]=a[6-1)-2]=a[3];	
			//	a[(a.length-1)-i]=c
			
			
		}
		
		System.out.println();
		
		for(int i=0; i<=a.length-1; i++)  {
			System.out.println(a[i]);
		}
	}
		

}

