package ui;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import util.MyConsole;

public class AnagramApp {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	
    	char[] firstString = a.toCharArray();
    	char[] secondString = b.toCharArray();
    	List<Character> compareString1 = new ArrayList<>();
    	List<Character> compareString2 = new ArrayList<>();
    	for (char c : firstString) {
    		compareString1.add(c);
    	}
    	for (char c : secondString) {
    		compareString2.add(c);
    	}
    	compareString1 = compareString1.stream()
    			.sorted()
    			.collect(Collectors.toList());
    	compareString2 = compareString2.stream().sorted()
    			.collect(Collectors.toList());
    	if (compareString1.equals(compareString2)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    public static void main(String[] args) {
    
    	MyConsole.printLine("welcome to my app");
    	String choice = "y";
        Scanner scan = new Scanner(System.in);
        while (choice == "y") {
        String a = MyConsole.promptString("First string:").toLowerCase().trim();
        String b = MyConsole.promptString("Second string:").toLowerCase().trim();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        }
        scan.close();
        MyConsole.printLine("Goodbye");
    }
}