package weeklyassignments;

public class Program_palendromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1221;
		int original=num;
		int reverse=0;
		while(num>0)
		{
			int digit =num%10;            //1  2  2 1
			    reverse=reverse*10+digit; //1  2   2 1
			    num=num/10;               // 122 12  1  0
			    
			
		}
		if(original==reverse)
		{
			System.out.println("Its Palendrom Number");
		}
		else  System.out.println("Not Palendrom numnber");
		

	}

}
