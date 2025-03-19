package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.Contact;
import model.TestContact;
import util.MyConsole;

public class ContactManagerApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Contact Manager App With Lambdas");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// show all contacts

		displayContacts(contacts);
		// show contacts missing phone #s
		// where phonenumbers are null
		List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone() == null);
//		List<Contact> contactsNoPhone= new ArrayList<>();
//		for (Contact c : contacts) {
//			if (c.getPhone()== null) {
//				contactsNoPhone.add(c);
//			}
//		}
		MyConsole.printLine("Contacts no phone: ");
		displayContacts(contactsNoPhone);
		List<Contact> contactsNoEmail = new ArrayList<>();
		// show contacts missing email
//		for (Contact c: contacts) {
//			if (c.getEmail()== null)
//				contactsNoEmail.add(c);
//		}
		List<Contact> contactNoPhoneNoEmail = filterContacts(contacts,
				c -> c.getPhone() == null && c.getEmail() == null);
		MyConsole.printLine("Contacts no phone no email");
		displayContacts(contactNoPhoneNoEmail);
		MyConsole.printLine("Contacts last name Murach:");

		MyConsole.printLine("Names: ");
		processContacts(contacts, c -> MyConsole.printLine("Name: " + c.getName()));
		List<Contact> contactLastNameMurach = filterContacts(contacts, (Contact c) -> {
			String[] names = c.getName().split(" ");
//													         String lastNameString = names[1];
			return names[1].equals("Murach");
		});

		// change names in contact list to uppercase
		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		processContacts(contacts, c -> MyConsole.printLine("Name Uppercase: " + c.getName()));
		MyConsole.printLine("Contact strings w/ default values if phone is null ");
		List<String> contactPhoneNumbers = transformContacts(contacts, c -> {
			String phone = (c.getPhone() == null) ? "n/a" : c.getPhone();
			return c.getName() + ": " + phone;
		});
		for (String s : contactPhoneNumbers) {
			MyConsole.printLine(s);
		}
		
		
		//p 551 streams to print for loop
		MyConsole.printLine("I used a stream to print this below!");
		contactPhoneNumbers.stream().forEach(s -> MyConsole.printLine(s));;
		
		//Bonus streams on arrays? no. would need to be arraylist
		String[] names = {"Nick", "Jim", "Andy"};
		List<String> namesAsList = Arrays.asList(names);
		namesAsList.stream().forEach(s -> s = s.toUpperCase());
		namesAsList.stream().forEach(c -> MyConsole.printLine(c));
		
		contacts.stream()
				.filter(c -> c.getPhone()==null)
				.forEach(c -> MyConsole.printLine("Filtered with a stream "+ c.getName()));
		List<String> nameBoy = new ArrayList<>();
		displayContacts(contactLastNameMurach);
		// use a stream to filter a list and collect the items in a new list

		contactsNoPhone = contacts.stream()
							.filter( c -> c.getPhone()== null)
							.collect(Collectors.toList());
		//mapping 553
		List<String> contactNames = contacts.stream()
				.map(c -> c.getName())
				.collect(Collectors.toList());
		MyConsole.printLine("map to string");
		contactNames.stream().forEach(str -> MyConsole.printLine(str));
		
		// same example w double colon
		List<String> contactNames2 = contacts.stream()
				.map(Contact :: getName)
				.collect(Collectors.toList());
		MyConsole.printLine("map to string2");
		contactNames2.stream().forEach(MyConsole::printLine);
		
		
		
		
		contactsNoPhone.stream().forEach(c -> MyConsole.printLine(c.getName()));
		
		
		
		//p555 map reduce contacts to a single string in csv comma separated value format
		String csv = contacts.stream().map(c -> c.getName()).reduce("", (a, b) -> a +b +", ");
		csv = csv.substring(0, csv.length()-2);
		
		MyConsole.printLine("Printing csv: "+csv);
		List<Double> prices = new ArrayList<>(Arrays.asList(11059.32, 23456.0, 31789.8, 1111.11, 40123.5));
		double maxPrice = prices.stream().reduce(0.0, (a, b) -> Math.max(a, b));
		MyConsole.printLine("Max amt: "+maxPrice);
		double sumPrice = prices.stream().reduce(0.0, (a, b) -> (a+b));
		MyConsole.printLine("Sum: "+sumPrice);
		
		double minPrice = prices.stream().reduce(Double.MAX_VALUE, Math::min);
		MyConsole.printLine("Min amt: "+minPrice);
		
		MyConsole.printLine("Bye bye");
	}
	
	

	private static void displayContacts(List<Contact> contacts) {
		for (Contact c : contacts) {
			MyConsole.printLine(c.toString());
		}
	}

	// p 543
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c : contacts) {
			consumer.accept(c);
		}
	}

	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function) {
		List<String> strings = new ArrayList<>();
		for (Contact c : contacts) {
			strings.add(function.apply(c));
		}
		return strings;
	}

//	private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition)
	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
