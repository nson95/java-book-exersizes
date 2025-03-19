package ui;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import util.MyConsole;

public class ContactManagerNoLambdaApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the Contact Manager App");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// show all contacts
		
		displayContacts(contacts);
		// show contacts missing phone #s
		List<Contact> contactsNoPhone= new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone()== null) {
				contactsNoPhone.add(c);
			}
		}
		MyConsole.printLine("Contacts no phone: ");
		displayContacts(contactsNoPhone);
		List<Contact> contactsNoEmail = new ArrayList<>();
		// show contacts missing email
		for (Contact c: contacts) {
			if (c.getEmail()== null)
				contactsNoEmail.add(c);
		}
		MyConsole.printLine("Contacts no email:");
		displayContacts(contactsNoEmail);
		MyConsole.printLine("Bye bye");
	}
	private static void displayContacts(List <Contact> contacts) {
		for (Contact c : contacts) {
			MyConsole.printLine(c.toString());
		}
	}
	
}
