package anvita;

public class myEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
			
		while(i <= 30) {	
	
		if (i%2 == 0) {
		 System.out.println( " " +i + " is a even number");
		 } else {
			System.out.print("");
		 }
		i = i + 1;
		}
		
		System.out.println(" ");
		
		int x = 0;
		
		while(x <= 30) {	
	
		if (x%2 != 0) {
		 System.out.println( " " + x + " is a odd number");
		 } else {
			System.out.print("");
		 }
		x = x + 1;
		}
	} 
	}
