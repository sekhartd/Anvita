package anvita;

import java.util.Arrays;
import java.util.Scanner;

public class myScoreSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
		
        int a;
		int b; 
		int c;
		int d;
		
		System.out.println("Enter your score:");
		a = reader.nextInt();
		
		System.out.println("Enter your score:");
		b = reader.nextInt();
		
		System.out.println("Enter your score:");
		c = reader.nextInt();
		
		System.out.println("Enter your score:");
		d = reader.nextInt();
		
	    int[] score = {a,b,c,d};
	   
	    System.out.println("Your scores from least to greatest are: ");
        
	    for(int i = 0;i<score.length;i++) {
	    Arrays.parallelSort(score);	
        System.out.println(score[i]);
		}
	}

}
