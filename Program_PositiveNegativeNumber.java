package arryasexample;

public class Program_PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {-4,7,0,2,9,9,0,-8,5};
		//int arrs1[]=new int [arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>0)
			{
				System.out.print(arr1[i]+" ");
			}
			
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<0)
			{
				System.out.print(arr1[i]+" ");
			}
			
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				System.out.print(arr1[i]+" ");
			}
			
		}

	}

}
