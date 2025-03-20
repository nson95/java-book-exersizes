//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class PhoneBookApp{
	public static void main(String []argh)
	{
		String inputString = "3\r\n"
				+ "uncle sam\r\n"
				+ "99912222\r\n"
				+ "tom\r\n"
				+ "11122222\r\n"
				+ "harry\r\n"
				+ "12299933\r\n"
				+ "uncle sam\r\n"
				+ "uncle tom\r\n"
				+ "harry";
		Scanner in = new Scanner(inputString);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<>();
		List<String> queries = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneBook.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s= in.nextLine();
			queries.add(s);
		}
        
		for (String q : queries) {
			if (phoneBook.containsKey(q)) {
				System.out.println(q + "=" + phoneBook.get(q));
			} else {
				System.out.println("Not found");
			}
		}
        
        
	}
}