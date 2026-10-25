package arryasexample;

public class Program_missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,5,6,7,8,9,10};
		
		int n=arr.length+1;//n*(n+1)/2;
		int sum=0;
		int expctedValue=n*(n+1)/2;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		int missing_num=expctedValue-sum;
		System.out.println(missing_num);

	}

}
