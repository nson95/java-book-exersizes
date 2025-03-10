import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit: ");
			double degF = sc.nextDouble();
			double degC = (double)(degF-32)*5/9;
			System.out.println("Degrees in Celsius: "+degC);
			sc.nextLine();
			System.out.print("Continue? (y/n) ");
			choice = sc.nextLine();
			
		}
		sc.close();
		System.out.println("Goodbye!");
	}

}
