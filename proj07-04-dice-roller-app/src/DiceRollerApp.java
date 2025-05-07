import java.util.Random;

import util.MyConsole;

public class DiceRollerApp {
	public static void main(String []argh)
	{
		MyConsole.printLine("Welcome to the dice roller app");
		
		int i = 0;
		Random randy = new Random();
		String choice = "y";
		
		randy.nextInt(1,7);
		
		MyConsole.printLine("Goodbye");
	}
	
}
