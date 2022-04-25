package command.implementation_1;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private static List<String> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void add(String contact) {
        contacts.add(contact);
    }

    public void update(String oldContact, String newContact) {
        contacts.set(contacts.indexOf(oldContact), newContact);
    }

    public void remove(String contact) {
        contacts.remove(contact);
    }

    public void printAll() {
        if(contacts.isEmpty()) {
            System.out.println("List is empty");
        } else {
            contacts.forEach(System.out::println);
        }
    }
}
