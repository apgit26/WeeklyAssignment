package arryasexample;

public class Program_arrayMovezero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0,5,0,3,8,0,2,9};
		
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
			
			System.out.print(index);
			System.out.print("");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + "");
		}

	}

}
