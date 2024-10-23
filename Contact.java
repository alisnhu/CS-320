/**********************************************
 
 Author: Ali ARSLAN
 Email : ali.arslan@snhu.edu
 Student Id : 2851731
 Course : CS-320
 Work : 3-2 Milestone: Contact Service
 File: Contact.java
 This code create a class it will be data type for each contact and will store information
 Sep 20 2024
 
 
***********************************************/


package project;

public class Contact {

	private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        
    	// when we put null
    	if (contactId == null || contactId.isBlank()) {
    	    throw new IllegalArgumentException("Invalid contact ID");
    	}
    	else if (contactId.length() > 10) {
    	    throw new IllegalArgumentException("Invalid contact ID");
    	}
    	else {
            this.contactId = contactId;
    	}
    	
        if (firstName == null  || firstName.isBlank()) {
            throw new IllegalArgumentException("Invalid first name");
        }
        else if ( firstName.length() > 10 ) {
            throw new IllegalArgumentException("Invalid first name");
        }
        else {
            this.firstName = firstName;
        }
        
        if (lastName == null   || lastName.isBlank()) {
            throw new IllegalArgumentException("Invalid last name");
        }
        else if (lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        else {
            this.lastName = lastName;
        }
        
        if (phone == null   || phone.isBlank()) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        else if (phone.length()!=10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        else {
            this.phone = phone;
        }
        
        if (address == null  || address.isBlank()) {
            throw new IllegalArgumentException("Invalid address");
        }
        else if (address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        else {
            this.address = address;
        }

    }

    // Getters
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setFirstName(String firstName) {
    	  if (firstName == null  || firstName.isBlank()) {
              throw new IllegalArgumentException("Invalid first name");
          }
          else if ( firstName.length() > 10 ) {
              throw new IllegalArgumentException("Invalid first name");
          }
          else {
              this.firstName = firstName;
          }
    }

    public void setLastName(String lastName) {
    	if (lastName == null   || lastName.isBlank()) {
            throw new IllegalArgumentException("Invalid last name");
        }
        else if (lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        else {
            this.lastName = lastName;
        }
    }

    public void setPhone(String phone) {
    	if (phone == null   || phone.isBlank()) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        else if (phone.length()!=10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        else {
            this.phone = phone;
        }
        
    }

    public void setAddress(String address) {
    	 if (address == null  || address.isBlank()) {
             throw new IllegalArgumentException("Invalid address");
         }
         else if (address.length() > 30) {
             throw new IllegalArgumentException("Invalid address");
         }
         else {
             this.address = address;
         }
    }
    

}
