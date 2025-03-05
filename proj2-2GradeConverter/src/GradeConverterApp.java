import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter\n");
		String choice ="y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			int nbrGrade = sc.nextInt();
			char letterGrade = 'F';
			if (nbrGrade >= 90) {
				letterGrade ='A';
			}
			else if (nbrGrade >= 80) {
				letterGrade = 'B';
			}
			else if (nbrGrade >= 70) {
				letterGrade = 'C';
			}
			else if (nbrGrade >= 60) {
				letterGrade = 'D';
			}
			sc.nextLine();
			System.out.println("Letter grade: " +letterGrade);
			System.out.print("Continue? (y/n) ");
			choice = sc.nextLine();
			
		}
		sc.close();
		System.out.println("Goodbye!");
	}

}
