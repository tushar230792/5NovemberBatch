package practicearray;

public class multiple {
	
	public static void main(String[] args) {  //multiple array in matrix form 
		
		int a[]  []= {{11,22,33},{44,55,66},{77,88,99}};   //declaration and initilization of array
		
		int b=a.length;
		
	//	System.out.println(b);
		
		for(int i=0; i<=2; i++)   {
			
		for(int j=0; j<=2; j++)   {
			
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
		}
	}
}
			
			
		
		


