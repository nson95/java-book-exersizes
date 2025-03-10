import java.util.Scanner;

public class SwitchStatementApp {

	public static void main(String[] args) {
		System.out.println("Welcome to swithc statement demo\n");
		Scanner sc = new Scanner(System.in);
		String command = "";
		while (!command.equalsIgnoreCase("exit") ) {
			System.out.println("MENU:");
			System.out.println("-------------");
			System.out.println("Get");
			System.out.println("Add");
			System.out.println("Delete");
			System.out.println("Exit");
			
			System.out.println("Command: ");
			command = sc.nextLine();
			switch (command) {
			case "Get":
				System.out.println("Get selected");
				break;
			case "Add":
				System.out.println("Add selected");
				break;
			case "Delete":
				System.out.println("Delete selected");
				break;
			case "Exit":
				System.out.println("Exit selected");
				break;
				default:
					System.out.println("Invalid command.");
			}
		}
		sc.close();
		System.out.println("\nBye");
	}

}
