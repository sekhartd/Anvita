package anvita;

import java.util.Scanner;

public class myDoWhileMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l;
		int n;

		 boolean command = true ;
			Scanner reader = new Scanner(System.in);	
			
			do {
			
			System.out.println("Which multiplication table would you like to know:");
			n = reader.nextInt();
			
			System.out.println("How far would you like your table to go?");
			l = reader.nextInt();
			}
			while (command == true); {
			
			for(int p=0;p<=l;p++) {
			System.out.println(n + " * " + p + " = "  + n*p);
	    	
	        System.out.println("would you like to continue?Enter true or false");
	        command = reader.nextBoolean();
			}
			}
				
	}

}
