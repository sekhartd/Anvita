package anvita;
import java.util.Scanner;

public class myMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);	
		
		System.out.println("Which multiplication table would you like to know:");
		int n = reader.nextInt();
		
		System.out.println("How far would you like your table to go?");
		int l = reader.nextInt();
		
		for(int p=0;p<=l;p++)
		System.out.println(n + " * " + p + " = "  + n*p);
		
	}
}
