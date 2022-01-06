package methods;

import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Give number to check");
	int num = sc.nextInt();
	
	if (isValid(num)) {
		showNumInfo(num);
		
	}else {
		showErrorMessage();
	}
	}
    static boolean isValid(int number) {
    	if (number > 0 && number % 3 == 0 ) {
		return true;	
		}
    	return false;
    }
    static  void showNumInfo(int number) {
    	int square = number*number;
    	int cube = square*number;
    	
    	System.out.println("Number is: "+ number);
    	System.out.println("Doubled number: "+ square);
    	System.out.println("Number is: "+ cube);
    }

   static void showErrorMessage() {
	   System.out.println("Invalid number");
   }
}

