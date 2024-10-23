/**********************************************
 
 Author: Ali ARSLAN
 Email : ali.arslan@snhu.edu
 Student Id : 2851731
 Course : CS-320
 Work : 3-2 Milestone: Contact Service
 File: ContactTest.java
 This code create a class it will be data type for each contact and will store information
 Sep 20 2024
 
***********************************************/



package test;

import project.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

	
	// testing object creation it is properly did or not ti test it after created object we get all attributes to set them up correct or not
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }
// ************* Testing All attributes from constructor************************/
    //Id test1 when its null code throw exception or not ?
    @Test
    public void testInvalidContactIdFirst() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }
    //Id test2 when its more than 10 characters will code throw exception or not ?
    @Test
    public void testInvalidContactIdSecond() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("abcdefghjklmn12345678", "John", "Doe", "1234567890", "123 Main St");
        });
    }
    //Id test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidContactIdThird() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("", "John", "Doe", "1234567890", "123 Main St");
        });
    }
    
    //name test1 when its null code throw exception or not ?
    @Test
    public void testInvalidNameFirst() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Doe", "1234567890", "123 Main St");
        });
    }

    //name test2 when its more than 10 characters code throw exception or not ?
    @Test
    public void testInvalidNameSecond() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "abcdefghjklimn123456678", "Doe", "1234567890", "123 Main St");
        });
    }
    //name test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidNameThird() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "", "Doe", "1234567890", "123 Main St");
        });
    }

    //lastname test1 when its null code throw exception or not ?
    @Test
    public void testInvalidLastNameFirst() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", null, "1234567890", "123 Main St");
        });
    }
    //lastname test2 when its more than 10 characters code throw exception or not ?
    @Test
    public void testInvalidLastNameSecond() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "abcdefghjklmnoprssth1234", "1234567890", "123 Main St");
        });
    }
    //lastname test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidLastNameThird() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "", "1234567890", "123 Main St");
        });
    }


    //phone test1 when its null code throw exception or not ?
    @Test
    public void testInvalidPhoneFirst() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", null, "123 Main St");
        });
    }
    //phone test2 when its less than 10 characters code throw exception or not ?
    @Test
    public void testInvalidPhoneSecond() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "123456789", "123 Main St");
        });
    }
    //phone test3 when its more than 10 characters code throw exception or not ?
    @Test
    public void testInvalidPhoneThird() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890123", "123 Main St");
        });
    }
    //phone test4 when its blank code throw exception or not ?
    @Test
    public void testInvalidPhoneForth() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "", "123 Main St");
        });
    }
    

    //address test1 when its null code throw exception or not ?
    @Test
    public void testInvaliAddressFirst() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", null);
        });
    }
    //address test2 when its more than 30 characters code throw exception or not ?
    @Test
    public void testInvalidAddressSecond() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", "123 Main Stz Apt. 3302 Watertown Ma 02472");
        });
    }
    //address test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidAddressThird() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Doe", "1234567890", "");
        });
    }
    
    
    
 // ************* Testing All attributes from Setter************************/

    
    //name test1 when its null code throw exception or not ?
    @Test
    public void testInvalidNameFirstFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setFirstName(null);
        });
    }

    //name test2 when its more than 10 characters code throw exception or not ?
    @Test
    public void testInvalidNameSecondFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setFirstName("asdfghjkloiuyt");
        });
    }
    //name test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidNameThirdFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setFirstName("");
        });
    }
    
    
    
  //lastname test1 when its null code throw exception or not ?
    @Test
    public void testInvalidLastNameFirstFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setLastName(null);
        });
    }
    //lastname test2 when its more than 10 characters code throw exception or not ?
    @Test
    public void testInvalidLastNameSecondFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setLastName("asdfgghjkloiuyytt");
        });
    }
    //lastname test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidLastNameThirdFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setLastName("");
        });
    }
    
    
    
    //phone test1 when its null code throw exception or not ?
    @Test
    public void testInvalidPhoneFirsFromSettert() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
            myContact.setPhone(null);
        });
    }
    //phone test2 when its less than 10 characters code throw exception or not ?
    @Test
    public void testInvalidPhoneSecondFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
            myContact.setPhone("123456789");
        });
    }
    //phone test3 when its more than 10 characters code throw exception or not ?
    @Test
    public void testInvalidPhoneThirdFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
            myContact.setPhone("1234567890123");
        });
    }
    //phone test4 when its blank code throw exception or not ?
    @Test
    public void testInvalidPhoneForthFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
            myContact.setPhone("");
        });
    }
    
    
    
  //address test1 when its null code throw exception or not ?
    @Test
    public void testInvaliAddressFirstFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setAddress(null);
        });
    }
    //address test2 when its more than 30 characters code throw exception or not ?
    @Test
    public void testInvalidAddressSecondFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setAddress("123 Main Stz Apt. 3302 Watertown Ma 02472");
        });
    }
    //address test3 when its blank will code throw exception or not ?
    @Test
    public void testInvalidAddressThirdFromSetter() {
    	Contact myContact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
        	myContact.setAddress("");
        });
    }
    

    
    
    

    


}
