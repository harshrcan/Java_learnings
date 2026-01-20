import java.util.Scanner;
public class project{
	
public static void main(String[] args) {
	
	//mini project
	int myNumber = (int)(Math.random()*100);
	
	Scanner sc = new Scanner(System.in);
	int userNumber = 0;
	do {
		System.out.println("guess my number: ");
		 userNumber = sc.nextInt();
		
		if (userNumber == myNumber) {
			System.out.println("wow !! correct guess ....");
			break;
		}
		else if(userNumber > myNumber){ 
			System.out.println("your guess is larger ");
		}
		else {
			System.out.println("your guess is smaller ");
			}
	}while (userNumber >= 0);
	
	
	System.out.println("my number was : " + myNumber);
	
	
	
	
	
}
}