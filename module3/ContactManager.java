import java.util.*;

public class ContactManager {

    public static void main(String[] args) {

        HashMap<String, Contact> contacts = new HashMap<>();

        // Step 4: add contacts
        contacts.put("Ada Lovelace",
                new Contact("Ada Lovelace", "+1 617 555 0101"));

        contacts.put("John Doe",
                new Contact("John Doe", "+1 123 456 7890"));

        contacts.put("Jane Doe",
                new Contact("Jane Doe", "+1 234 567 8901"));

        contacts.put("Joe Doe",
                new Contact("Joe Doe", "+1 345 678 9012"));

        contacts.put("Jess Doe",
                new Contact("Jess Doe", "+1 456 789 0123"));


        // Step 5: look up a contact
        Contact result = contacts.get("Ada Lovelace");

        if (result == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(result);
        }


        // Step 6: print sorted list
        ArrayList<Contact> sorted =
                new ArrayList<>(contacts.values());

        sorted.sort((a, b) ->
                a.getName().compareTo(b.getName()));

        System.out.println("\n=== All Contacts ===");

        for (Contact contact : sorted) {
            System.out.println(contact);
        }
    }
}