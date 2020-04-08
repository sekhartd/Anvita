package anvita;

import java.util.Arrays;
import java.util.Scanner;

public class myStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
        String a;
		String b; 
		String c;
		String d;
		
		System.out.println("Enter a Family Member:");
		a = reader.nextLine();
		
		System.out.println("Enter a Family Member:");
		b = reader.nextLine();
		
		System.out.println("Enter a Family Member:");
		c = reader.nextLine();
		
		System.out.println("Enter a Family Member:");
		d = reader.nextLine();
		
	    String[] family = {a,b,c,d};
	   
	    System.out.println("Your names from longest to shortest are: ");
        
	    for(int i = 0;i<family.length;i++) {
	    Arrays.sort(family);	
        System.out.println(family[i]);
		}
	}

}
