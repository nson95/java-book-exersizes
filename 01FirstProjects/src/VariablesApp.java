import java.util.Scanner;

public class VariablesApp {
 public static void main(String[] args) {
	 System.out.println("Welcome to variables!\n");
	 int nbr1 = 5;
	 int nbr2 =7;
	 int sum = nbr1+nbr2;
	 System.out.println(sum);
	 //no methods available for primitive data types,
	 //only store values
	 double p1 = 14.99;
	 
	 String name = "bob";
	 System.out.print(name);
	 Scanner sc = new Scanner(System.in);
	 System.out.print("\nEnter your name: ");
	 name = sc.nextLine();
	 System.out.print("Hi " +name+"\n");
	 
	 
	 System.out.print("Enter a number: ");
	 nbr1 = sc.nextInt();
	 System.out.println("You entered: " +nbr1);
	 sc.nextLine();
	 String choice = "y";
	 while (choice.equalsIgnoreCase("y")) {
		 System.out.println("In the while loop");
		 System.out.print("Continue? ");
		 choice = sc.nextLine();
	 }
	 if (nbr1 >= 10) {
		 System.out.println("Greater than 10");
	 }
	 
	 System.out.println("Goodbye!");
 }
}
