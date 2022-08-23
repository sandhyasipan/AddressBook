package com.bridgelabs;

import java.util.LinkedList;
import java.util.Scanner;

public class Contact {
    static Scanner scan = new Scanner(System.in);

    LinkedList<Contact> listData = new LinkedList();

    public void contactList() {
        System.out.println("Enter First Name");
        String firstName = scan.nextLine();

        System.out.println("Enter last Name");
        String lastName = scan.nextLine();

        System.out.println("Enter State Name");
        String state = scan.nextLine();

        System.out.println("Enter City Name");
        String city = scan.nextLine();

        System.out.println("Enter Address");
        String addressName = scan.nextLine();

        System.out.println("Enter phone Number");
        String phone = scan.nextLine();

        System.out.println("Enter email Address");
        String email = scan.nextLine();

        Contact contactsList = new Contacts(firstName,lastName,state,city,addressName,phone,email);
        listData.add(contactsList);
    }
}
