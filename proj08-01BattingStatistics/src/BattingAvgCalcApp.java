import java.util.Scanner;

import util.MyConsole;
public class BattingAvgCalcApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Batting Avg CalculatingApp Thing");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int result = 0;
			int timesAtBat = 0;
			timesAtBat = MyConsole.promptInt("Enter number at bats: ");
			int numHits = 0;
			int[] atBats = new int[timesAtBat];
			for (int i = 0; i < atBats.length; i++) {
				result = MyConsole.promptInt("Result for at-bat "+i+": ");
				atBats[i] = result;
			}
			for (int r : atBats) {
				if (r != 0) {
					numHits += r;
				}
			}
			MyConsole.printLine("Slugging pct: "+(numHits/atBats.length));
			
			
			choice = MyConsole.promptString("Another player? (y/n)");
		}
		MyConsole.printLine("Goodbye");
	}

}
