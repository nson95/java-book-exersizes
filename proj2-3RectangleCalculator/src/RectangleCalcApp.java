import java.util.Scanner;

public class RectangleCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcoe to the Area and Perimeter Calculator\n");
		String choice = "y";
		Scanner sc = new Scanner(System.in); 
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length: ");
			int length = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter width: ");
			int width = sc.nextInt();
			sc.nextLine();
			System.out.println("Area:\t\t" +width*length);
			System.out.println("Perimeter:\t\t" +(width*2+length*2));
			System.out.print("Continue? (y/n) ");
			choice = sc.nextLine();
		}
		sc.close();
		System.out.println("\nGoodbye!");
		

	}

}
