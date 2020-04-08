package anvita;

	import java.util.Scanner;
	
public class myScorer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your score:");
		
		int score;
		
		score = reader.nextInt();
		 
	    if (score == 100) {
		System.out.println("magnificent you got an A+");
	    }
	    else if ((score >= 90) && (score < 100)){
	    System.out.println("good job you got an A");
		}
		else if ((score >= 80) && (score < 90)) {
		System.out.println("you just need a little bit more work, you got a B ");
		}
		else if ((score >= 70) && (score < 80)) {
		System.out.println("just passed you got a C ");
		}
		else if (score < 70) {
		System.out.println("sorry but you failed you got a F ");
		}
		}
}
