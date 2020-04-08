package anvita;

public class myCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		
		a = 20;
		b = 4;		
		int multiplication;
		multiplication = a * b;
		
		int addition;
		addition = a + b;
		
		int division;
		division = a / b;
		
		int subtraction;
		subtraction = a - b;
		
		int operation;
		
		operation = division;
		
		if (operation == addition) {
			System.out.println("the sum of the two numbers is:" + addition);
			
		}else if(operation == multiplication) {
			System.out.println("the product of the two numbers is:" + multiplication);
			
		}else if(operation == division) {
			System.out.println("the quotient of the two numbers is:" + division);
			
		}else if(operation == subtraction) {
			System.out.println("the difference of the two numbers is:" + subtraction);	
			
			}
		}
	    
	}

