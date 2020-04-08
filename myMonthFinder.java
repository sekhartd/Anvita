package anvita;

import java.util.Scanner;

public class myMonthFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean request = true ;
	    Scanner reader = new Scanner(System.in);
    	
	    while(request) {
	    	System.out.println("Enter a Number");
	    int m = reader.nextInt();

	     if (m == 1) {
	    	System.out.println("It is January");  
	    }	else if (m == 2) {
	    	System.out.println("It is February");
	    }	else if (m == 3) {
	    	System.out.println("It is March");
	    }	else if (m == 4) {
	    	System.out.println("It is April");
	    }	else if (m == 5) {
	    	System.out.println("It is May");
	    }	else if (m == 6) {
	    	System.out.println("It is June");
	    }	else if (m == 7) {
	    	System.out.println("It is July");
	    }	else if (m == 8) {
	    	System.out.println("It is August");
	    }	else if (m == 9) {
	    	System.out.println("It is September");
	    }	else if (m == 10) {
	    	System.out.println("It is October");
	    }	else if (m == 11) {
	    	System.out.println("It is November");
	    }	else if (m == 12) {
	    	System.out.println("It is December");
	    }   else {
	    	System.out.println("Please enter another number that is less than or equal to 12");
	    	
	    }
	    	System.out.println("Would you like to continue?Enter true or false");
	    	request = reader.nextBoolean();
	    }
	    }
}

