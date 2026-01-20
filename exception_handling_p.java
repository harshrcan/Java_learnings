public class exception_handling_p{
	public static void main(String[] args) {
		
		//try - catch in exception handling
		int[] marks = {87,93,94,91};
		
		try{
			System.out.println(marks[2]);///if value exceed array length here then error occurs 
		}catch(Exception exception) {
			System.out.println("hi");/// runs in case of exception and error in try statement
		}
		
		System.out.println("hi 2");////executed normally
	}
}