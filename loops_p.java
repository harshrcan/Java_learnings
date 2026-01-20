import java.util.Scanner;

public class loops_p{
	public static void main(String[] args) {
		
		//loops
		// for loop////////////////////////////////////////////////////////////////////////////////////////////
		for(int i = 1; i <101 ; i = i+1) {
			System.out.println("hi harsh i " + i);
		}
		 
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		/// while loop
		int x =100;
		while(x >=1 ) {
			System.out.println("hi harsh x " + x);
			x--;
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
	//do while loop
		int k = 100;
		do {System.out.println("hi harsh k " + k);
		k--;
		}while(k >= 1);
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Scanner sc = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("input a number");
			 number = sc.nextInt();
			System.out.print("here is your number: ");
			System.out.println(number);
			
		}while(number >= 0); 
		
		System.out.println("the end");
		
	
	}
	}