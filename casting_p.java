 public class casting_p{
	 
	 public static void main(String[] args) {
		 
		//casting
		 double price = 100.00;
		 double finalPrice = price + 18;// int can be added in double and stored
		
		 System.out.println(finalPrice);
		 int p = 100;
		 int fP = p + (int)18.90 ;// double can't be added in int and stored (i.e. if u add p and 18.00 without adding (int)in front of it// it rounds off lower too )
		 
		 
		 System.out.println(fP);
		 
	 } 
 }