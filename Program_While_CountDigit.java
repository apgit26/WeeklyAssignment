package weeklyassignments;

public class Program_While_CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=987654;
		int count=0;
		
		 while(num!=0) //this condition will check till last digit and when mod is 0 it will out of the loop
		 {
			 num=num/10;
			 count++;
		 }
		 
         System.out.println("Number of Digit is "+count);
	}

}
