import util.MyConsole;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Batting Average Caclulator\n");
		String choice = "y";
		int numAtBats = 0;
		int[] totalAtBats;
		while (choice.equalsIgnoreCase("y")) {
			numAtBats = MyConsole.promptInt("Enter number of times at bat: \n");
			totalAtBats = new int[numAtBats];
			for (int i = 0; i<numAtBats; i++) {
				totalAtBats[i] = MyConsole.promptInt("Result for at bat: "+(i+1));
			}
			
		}
		
	}

}
