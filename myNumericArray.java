package anvita;

import java.util.Arrays;
import java.util.Scanner;

public class myNumericArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
        int a;
		int b; 
		int c;
		int d;
		
		System.out.println("Enter a number:");
		a = reader.nextInt();
		
		System.out.println("Enter a number:");
		b = reader.nextInt();
		
		System.out.println("Enter a number:");
		c = reader.nextInt();
		
		System.out.println("Enter a number:");
		d = reader.nextInt();
		
	    int[] num = {a,b,c,d};
	   
	    System.out.println("The entered numbers in order from least to greatest: ");
        
	    for(int i = 0;i<num.length;i++) {
	    Arrays.parallelSort(num);	
        System.out.println(num[i]);
		}
	}

}
