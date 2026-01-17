// 
//Indian flag with = symbolizing orange , # green , empty space white and o is the wheel in center
// 

public class DrawFlag_RanaH
{
	public static void main(String[] args) {
		System.out.println("This is Indian Flag");
		 System.out.println();
        drawFlag();
        
    }

    public static void drawFlag() {
        int totalStripes = 9;

        // i have used 9 stripes in total to divide it into 3 equal portions 
        for (int stripe = 0; stripe < totalStripes; stripe++) {
            if (stripe < 3) {
                drawOrange();
            } else if (stripe == 3) {
                drawWhite();
            }else if (stripe == 4) {  
                drawCircle();
            }
            // stripe 3,4,5 represent the middle portion which has white bg and the wheel 
            else if (stripe == 5) {
                drawWhite();
            }
            else {
                drawGreen();
            }
        }
    }


    public static void drawOrange() {
        for (int j = 0; j < 50; j++) {
            System.out.print("=");
        }
        System.out.println();
    }


    public static void drawWhite() {
        for (int j = 0; j < 50; j++) {
           
                System.out.print(" ");
            
        }
        System.out.println();
    }
    
    public static void drawCircle() {
        for (int j = 0; j < 50; j++) {
        	if (j == 24) {
                System.out.print("O"); 
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        }

    
    public static void drawGreen() {
        for (int j = 0; j < 50; j++) {
            System.out.print("#");
        }
        System.out.println();
    }
}







