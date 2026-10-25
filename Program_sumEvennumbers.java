package weeklyassignments;

public class Program_sumEvennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp =0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				temp=temp+i;
			}
				
		}
		System.out.println("Sum is "+temp);

	}

}
