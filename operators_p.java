import java.util.Scanner;

public class operators_p{
	public static void main(String[] args) {
		
		//operators
		int a = 1;
		int b = 2;
		int c = 5;
		int d = 10;
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		int sum = a+b;
		System.out.println(sum);
		
		int minus = a-b;
		System.out.println(minus);
		
		int mul = a*b;
		System.out.println(mul);
		
		int div = d / c;
		System.out.println(div);// change variable and div to double to get in decimal points
		
		int mod = c % b;
		System.out.println(mod);//remiander after division
		
		
		// = is the assignment operator
		///////////////////////////////////////////////////////////////////////////////////////////////////
		//the following can be placed in front too to get the result first 
		System.out.println(c);
		c++;
		System.out.println(c);
		a--;
		System.out.println(a);
		//the following can be placed in front too to get the result first 
		
		System.out.println(c++);
		System.out.println(c);
		//and 
		System.out.println(--d);
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		//comparison operator
		//a==b are the values equal
		//not equal to //a != b 
		//a < b
		//a > b
		// a <= b
		// a >= b
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		/// logical operators
		/// && and
		/// || or
		/// ! not
		/// 
		int x = 300;
		int y = 840;
		
		if (x <50 && y < 50)
			System.out.println("both are less then 50");
		else if (x < 50 || y < 50)
			System.out.println("one is not less then 50");
		else 
			System.out.println("both are not less then 50");
		
		boolean isAdult = false;
		if ( ! isAdult)
			System.out.println("not an adult");
		else
			System.out.println("is adult");
		
		////////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		//pen = 10 ; notebook = 40
		System.out.println("Enter the amount u have :");
		int cash = sc.nextInt();
		if (cash < 10)
		{System.out.println("cannot buy anything");
		System.out.println("get more cash");
		}
		else if (cash > 10 && cash <50) {
			System.out.println("can get one item");
				
		}
				else {
					
					System.out.println("can get both");
				}
			
		
		
		
		
	}
}
