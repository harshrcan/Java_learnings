import java.util.Scanner;
//////first import this to take inputs 
public class input_p{
	public static void main(String[] args) {
		
		//how to take input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
	
		  sc.nextLine(); // clears buffer of space which prevent compiler to assume name as space when enter is pressed on age input
		
		System.out.println("enter name:");
		String name = sc.nextLine();/////nextline for taking string whole line input 
		//next for taking one word string ,,,nextInt for integer , nextFloat for float etc
		///change string , int , float accordingly
		System.out.println(name);
		System.out.println(age);
		
		
	}
}