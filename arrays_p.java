import java.util.Arrays;

public class arrays_p{
	public static void main(String[] args) {
		//ways to make array///////////////////////////////////////////////////////////
		//1D arrays////////////////////////////////////////////////////////////////////
		//way 1
	int [] marks = new int[3];
	marks[0] =97;
	marks[1] = 44;
	marks[2] = 95;
	System.out.println(marks[0]);
	
	//way 2 // easiest
	int[] score = {85, 90, 78, 92};
	System.out.println(score[0]);

	
	//way 3
	int[] ages = new int[]{18, 20, 22};
	System.out.println(ages[0]);
	
	
	
	System.out.println(marks.length);//length of array no (paranthesis) in array 
	System.out.println(marks[0]);
	Arrays.sort(marks);//sorting array marks in ascending order
	System.out.println(marks[0]);
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	//2D arrays
	////////////////////////////////////////////////////////////////////////////////////////////
	//way1					
	int[][] finalMarks = {{97,94,37}, {84,34,34}};
	System.out.println(finalMarks[0][0]);// first student marks 1
	System.out.println(finalMarks[0][1]);// first student marks 2
	System.out.println(finalMarks[1][0]);// second student marks 1
	System.out.println(finalMarks[1][2]);//second student marks 3
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	/// using for loop to print whole array
	/// 
	int[] arr = {10, 20, 30, 40};

	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
	}
}