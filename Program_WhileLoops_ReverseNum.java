package weeklyassignments;

public class Program_WhileLoops_ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int rev=0;
		
		 while(num!=0)
		 {
			 int digit=num%10;
			 rev=rev*10+digit; //rev=0+10*5=5; 5*10+4=54; 54*10+3=543; 543*10+2=5432; 5432*10+1=54321 
			 num=num/10;       // 12345/10=1234; 1234/10=123 ;123/10=12; 12/10=1; now num is 0  
 
		 }
		 System.out.println("Reverse is "+rev); //
		
	}

}
