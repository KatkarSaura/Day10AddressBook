package com.bridgelabz;
import java.util.ArrayList;


public class AddressBookMain {
	
    public static void main(String[] args) {

	   System.out.println("Welcome to Address Book Management");
	   ArrayList<Person> list=new ArrayList<Person>();

	   AddressBook ab = new AddressBook();
	   ab.operation(list);

	    }
	}
