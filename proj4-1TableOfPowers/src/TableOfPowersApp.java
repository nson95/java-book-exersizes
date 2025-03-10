import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer: ");
			int num = sc.nextInt();
			System.out.println("Number  Squared  Cubed");
			System.out.println("======  =======  =====");
			for (int i = 0; i<=num; i++) {
				int squared = i*i;
				int cubed = i*i*i;
				System.out.println(i+"\t"+squared +"\t"+cubed);
			}
			sc.nextLine();
			System.out.print("Continue? (y/n) ");
			choice = sc.nextLine();
		}
		sc.close();
		System.out.println("\nGoodbye!");

	}

}
