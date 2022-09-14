import java.util.Scanner;

public class September14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many weeks are there? ");
		int weeks = in.nextInt();
		
		final int DAYSOFWEEK = 7;
		
		System.out.print("How many days per week are you working? " );
			int days = in.nextInt();
		
		while (days > DAYSOFWEEK) {
			System.out.println("A week can only have 7 days.\n" +
								   "Enter in the proper amount of days:");
			days = in.nextInt();
		} 
		
		for (int i = 1; i <= weeks; i++) {
			System.out.println("Week: " + i);
			
			for (int j = 1; j <= days; j++) {
				System.out.println("	Day: " + j);
			}
		}
	}
}