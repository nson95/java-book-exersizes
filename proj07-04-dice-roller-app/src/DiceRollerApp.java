import java.util.Random;

import util.MyConsole;

public class DiceRollerApp {
	public static void main(String []argh)
	{
		MyConsole.printLine("Welcome to the dice roller app");
		int i = 0;
		Random randy = new Random();
		String choice = "y";
		while (choice.equals("y")) {
			int die1 = randy.nextInt(1,7);
			int die2 = randy.nextInt(1,7);
			MyConsole.printLine("Die 1: "+die1);
			MyConsole.printLine("Die 2: "+die2);
			MyConsole.printLine("Total: "+(die1+die2));
			if (die1+die2==12) {
				MyConsole.printLine("Box Cars!");
			}
			else if (die1+die2==2) {
				MyConsole.printLine("Snake Eyes!");
			}
			choice = MyConsole.promptReqString("Continue?: (y/n)", "y", "n");
		}
		MyConsole.printLine("Goodbye");
	}
	
}
