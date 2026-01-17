public class dataTypes_p{
	
	public static void main(String[] args){
		
		
		
		
		//primitive data types
		int phone = 1234567890;
		
		float pi = 3.14F;
		long phone2 = 12345678900L;
		char letter = '@';
		boolean isAdult = false;
//		String name ="Harsh Rana";	
		
		//non primitive data types
		String name = "Harsh Rana";
		
		System.out.println( name + " has " +name.length() + " letters");	//length function , called by dot operator
		System.out.println(name.charAt(2));// charAt function 
		String name2 = name.replace('a', 'x');		//.replace used to replace characters ,, use single quotes
		System.out.println(name2);
		String name3 = "harsh and nikhil";
		System.out.println(name3.substring(0,5));	// .substring (from , to +1);
		System.out.println(name3.substring(6,9));
		
		
		
		
		
		
	}
}