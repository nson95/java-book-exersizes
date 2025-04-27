import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScannerMapApp {
	public static void main(String[] args) {
		System.out.println("Hi welcome to my Demo");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter some data: ");
////		String inputStr = sc.nextLine();
////		System.out.println("You entered "+inputStr);
//		String val1 = sc.next();
//		String val2 = sc.next();
//		String val3 = sc.next();
//		String val4 = sc.next();
//		String val5 = sc.next();
//		System.out.println("Values: "+val1+", "+val2+", "+val3+", "+val4+", "+val5);
//		
//		sc.close();
		
//		String sentence = "The 2 kids rode their bikes 5.5 miles.";
//		Scanner sc1 = new Scanner(sentence);
//		while (sc1.hasNext()) {
//			System.out.println(sc1.next());
//		}
//		sc1.close();
		Map<String, String> statesMap = new HashMap<>();
		String statesString = "OH Ohio KY Kentucky IN Indiana FL Florida OK Oklahoma MN Minnesota";
		Scanner stSc = new Scanner(statesString);
		while (stSc.hasNext()) {
			String abbr = stSc.next();
			String stName = stSc.next();
			statesMap.put(abbr, stName);
		}
//		System.out.println("States Map Entries: ");
//		for (Entry<String, String> entry : statesMap.entrySet()) {
//			System.out.println(entry.getKey()+", "+entry.getValue());
//		}
//		stSc.close();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter State Abbreviation :");
		String stateAbbrev = sc2.next();
		System.out.println("State is : " +statesMap.get(stateAbbrev));
		System.out.println("Bye");
	}
}
