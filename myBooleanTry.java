package anvita;

import java.util.Scanner;

public class myBooleanTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean command = true ;
		while (command)
		{
		
		Scanner reader = new Scanner(System.in);
		int l;
		int w;
		int a;
		int p;
		
		    System.out.println("Enter a length");
		    l = reader.nextInt();
		    System.out.println("Enter a width");
		    w = reader.nextInt();
		   
		    p=l+l+w+w;
			a= l*w;
			
		if (l == w) {
		
			System.out.println("your shape is a square");
			System.out.println("the area of your shape is: " + a);
			System.out.println("perimeter of your shape is: " + p);
			System.out.println("");
			
		}
		else if (l != w ) {
			
		    System.out.println("your shape is a rectangle");
		    System.out.println("the area of your shape is: " + a);
			System.out.println("perimeter of your shape is: " + p);
			System.out.println("");

		}
	
			System.out.println("Would you like to continue?Enter true or false");
			command = reader.nextBoolean();
		
	}
		
	
	}
	
	}



