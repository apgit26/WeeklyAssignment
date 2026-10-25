package arryasexample;

public class Program_Common_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {10,20,30,40,50,8};
		int arr2[]= {30,40,60,70,50,10};
		
		
		for(int i=0;i<arr1.length;i++)    
		{
			//temp=arr1[i]; 
					
			for(int j=0;j<arr2.length;j++) 
			{
								
				if(arr1[i]==arr2[j])  
				{
					System.out.println(" " +arr1[i]);
					break;
				}
				//break;
				
			}
			
		}

	}

}
