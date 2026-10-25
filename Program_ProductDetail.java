package weeklyassignments;

public class Program_ProductDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		  byte Qty=3;
		  double ProductPrice=499.50d;
		  double Total_Price;
		  Total_Price=ProductPrice*Qty;
		 
		
		System.out.println("Product Price: "+ProductPrice);
		System.out.println("Quantity :"+Qty);
		System.out.printf("Product Price= %.2f", Total_Price);
		System.out.println();
		

	}

}
