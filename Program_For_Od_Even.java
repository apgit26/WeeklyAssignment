package weeklyassignments;

public class Program_For_Od_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//below Code is to print Even Numbers
		System.out.println("Even number ");
		for(int i=1;i<=20;i++)
		{
			
			if(i%2==0)  //It checks that reminder is 0 and if it is 0 then it is Even
			{
				
				System.out.print(i);
			}
						
			
		}
		
		System.out.println();
		System.out.println();
		
		//below Code is to print Odd Numbers
		System.out.println("Odd number ");
		for(int i=1;i<=20;i++)
		{
			
			if(i%2!=0)      //It checks that reminder is not 0 and if it is 0 then it is Even
			{
				
				System.out.print(i);
			}
						
			
		}

	}

}
