package ui;

import util.MyConsole;

public class TicTacToeApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Tic Tac Toe App!");
		
		MyConsole.printLine("Goodbye!");
	}
	
	private static void makeGrid() {
		MyConsole.printLine("+---+---+---+\n"
						  + "|   |   |   |\n"
						  + "+---+---+---+\n"
						  + "|   |   |   |\n"
						  + "+---+---+---+\n"
						  + "|   |   |   |\n"
						  + "+---+---+---+\n");
	}

}
