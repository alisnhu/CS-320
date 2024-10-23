/**********************************************
 
 Author: Ali ARSLAN
 Email : ali.arslan@snhu.edu
 Student Id : 2851731
 Course : CS-320
 Work : 3-2 Milestone: Contact Service
 File: ContactService.java
 This code create a class it will be data type for each contact and will store information
 Sep 20 2024
 
***********************************************/


package project;

import java.util.HashMap;
import java.util.Map;



public class ContactService {
	
    private final Map<String, Contact> contacts = new HashMap<>();

    // Add contact
    public boolean addContact(Contact contact) {
    	if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null"); // Null kontrolü eklendi
        }
        if (contacts.containsKey(contact.getContactId())) {
            return false; // Contact ID must be unique
        }
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    // Delete contact by ID
    public boolean deleteContact(String contactId) {
        return contacts.remove(contactId) != null;
    }

    // Update contact fields
    public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            return false;
        }
        if (firstName != null && !firstName.isEmpty()) {
            contact.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            contact.setLastName(lastName);
        }
        if (phone != null && !phone.isEmpty()) {
            contact.setPhone(phone);
        }
        if (address != null && !address.isEmpty()) {
            contact.setAddress(address);
        }
        return true;
    }

    // Retrieve contact by ID
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }


}
