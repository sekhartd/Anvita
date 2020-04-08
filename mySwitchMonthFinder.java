package anvita;

import java.util.Scanner;

public class mySwitchMonthFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//	boolean request = true ;
	
	    Scanner reader = new Scanner(System.in);
		String confirm = reader.nextLine();
	    while(confirm == "yes") {
	    	System.out.println("Enter a Number");
	    	String month = reader.nextLine();
	     switch (month) {
	     case "1" : 
	        System.out.println("It is January"); 
	         break;
	     case "2" : 
		     System.out.println("It is February"); 
		     break;
	     case "3":
	    	 System.out.println("It is March");
	    	 break;
	     case "4":
	    	 System.out.println("It is April");
	    	 break;
	     case "5":
	    	 System.out.println("It is May");
	    	 break;
	     case "6":
	    	 System.out.println("It is June");
	    	 break;
	     case "7":
	    	 System.out.println("It is July");
	    	 break;
	     case "8":
	    	 System.out.println("It is August");
	     case "9":
	    	 System.out.println("It is September");
	    	 break;
	     case "10":
	    	 System.out.println("It is October");
	    	 break;
	     case "11":
	    	 System.out.println("It is November");
	    	 break;
	     case "12":
	         System.out.println("It is December");
	     break;
	   
	    default:
	    	System.out.println("Please enter another number that is less than 13 and greater than 0");
	    	System.out.println("");
	    
	     }
	    	System.out.println("Would you like to continue?Enter yes or no");
	    	//request = reader.nextBoolean();
	    	
	    }
	}
	}

