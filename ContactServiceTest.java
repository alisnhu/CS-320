package test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.*;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
    private ContactService contactService;

    
    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }
    
    
    //single object addition test
    @Test
    public void testAddSingleContact() {
        Contact contact = new Contact("C001", "Alice", "Smith", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
        assertEquals(contact, contactService.getContact("C001"));
    }

  //multiple object addition test
    @Test
    public void testAddMultipleContacts() {
        Contact contact1 = new Contact("C002", "Bob", "Johnson", "0987654321", "456 Elm St");
        Contact contact2 = new Contact("C003", "Charlie", "Brown", "1112223333", "789 Maple St");
        
        assertTrue(contactService.addContact(contact1));
        assertTrue(contactService.addContact(contact2));
        assertEquals(contact1, contactService.getContact("C002"));
        assertEquals(contact2, contactService.getContact("C003"));
    }

   //same contactId  addition test
    @Test
    public void testAddContactWithDuplicateId() {
        Contact contact1 = new Contact("C004", "David", "Williams", "4445556666", "321 Oak St");
        Contact contact2 = new Contact("C004", "Eve", "Davis", "7778889999", "654 Pine St");

        assertTrue(contactService.addContact(contact1));
        assertFalse(contactService.addContact(contact2)); // Duplicate ID should fail
    }

  //null data addition test
    @Test
    public void testAddNullContact() {
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(null));
    }
  //null pointer object addition test
    @Test
    public void testAddContactInstanceNull() {
        Contact myContact = null; // Null contact instance
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(myContact));
    }

    //nonexistent  data deletion test

    @Test
    public void testDeleteNonExistentContact() {
        assertFalse(contactService.deleteContact("C999")); // Should return false
    }
    //existent  data deletion test
    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("C005", "Frank", "Miller", "2223334444", "987 Birch St");
        contactService.addContact(contact);
        assertTrue(contactService.deleteContact("C005")); // Should return true
        assertNull(contactService.getContact("C005")); // Contact should be null after deletion
    }

    //update contact test
    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("C006", "Grace", "Lee", "5556667777", "345 Cedar St");
        contactService.addContact(contact);
        assertTrue(contactService.updateContact("C006", "Grace", "Lee", "8889990000", "456 Cherry St"));
        Contact updatedContact = contactService.getContact("C006");
        assertEquals("8889990000", updatedContact.getPhone());
        assertEquals("456 Cherry St", updatedContact.getAddress());
    }
   //update nonexistent contact test
    @Test
    public void testUpdateNonExistentContact() {
        assertFalse(contactService.updateContact("C999", "Test", "User", "1234567890", "Test Address"));
    }


	
}
