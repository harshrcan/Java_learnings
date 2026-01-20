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
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//break and continue
		
		int i = 0;
		while(true) {
			System.out.println(i);
			i++;
			
			if(i == 3) {
				i++; 
				continue;}/// wont print 3 and skip it
			
			
			if(i > 5) {break;}
		}
	
	}

	}
