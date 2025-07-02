import java.util.Scanner;

public class BattingStatisticsAppNoConsole {

	public static void main(String[] args) {
		System.out.println("Welcome to the batting average calculator\n");
		String choice = "y";
		int numAtBats = 0;
		int[] totalAtBats;
		int sum = 0;
		int hits = 0;
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number of times at bat: ");
			numAtBats = sc.nextInt();
			totalAtBats = new int[numAtBats];
			for (int i = 0; i<numAtBats; i++) {
				System.out.print("Enter result for at bat "+(i+1)+": ");
				totalAtBats[i] = sc.nextInt();
				if (totalAtBats[i]!=0) {
					hits++;
					sum+=totalAtBats[i];
				}
			}
			double avg = (double)hits/(double)numAtBats;
			System.out.printf("\nBatting Average: %.3f\n", avg);
//			for (int i =0; i<numAtBats; i++) {
//				System.out.println(totalAtBats[i]);
//			}
			numAtBats= 0;
			hits=0;
			sum= 0;
			sc.next();
			System.out.print("Another player? (y/n)");
			choice = sc.next();
		}
	}

}
