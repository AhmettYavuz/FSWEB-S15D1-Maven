package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact("Test", "12345678");
        MobilePhone mobilePhone = new MobilePhone("Test");
        mobilePhone.addNewContact(contact);

        mobilePhone.removeContact(contact);

    }
}
