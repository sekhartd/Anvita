package anvita;

import java.util.Scanner;

public class myNameSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		String n;
		String m;

		String q;
		q = "Yes";


		while (q.equals("Yes")) {

			System.out.println("Enter First name:");
			n = reader.nextLine();

			System.out.println("Enter Second name:");
			m = reader.nextLine();

			if (n.equals(m)) {
				System.out.println("Both names are the same");

			} else {
				System.out.println("Sorry! the names are not the same");

			}
			System.out.println("Do you want to contine this game- Please enter Yes or No :");
			q = reader.nextLine();
			
			if (q.equals("No")) {
				System.out.println("Bye Bye");
			}
		}
	}

}
