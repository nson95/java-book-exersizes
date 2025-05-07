import java.util.Random;

import util.MyConsole;

public class DiceRollerApp {

	public static void main(String[] args) {
		MyConsole.printLine("Dice Roller\n\n");
		String choice = "y";
		int roll1 = 0;
		int roll2 = 0;
		while (choice.equals("y")) {
			Random randy = new Random();
			roll1 = randy.nextInt(1, 7);
			MyConsole.printLine(""+roll1);
			roll2 = randy.nextInt(1, 7);
			MyConsole.printLine();
			if (roll1+roll2==2) {
				
			}
			choice = MyConsole.promptReqString("Continue? y/n: ", "y", "n");
		}
		MyConsole.print("Goodbye");
	}

}
