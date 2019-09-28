package com.dev.contact;

import java.util.Scanner;

public class Contact {
	static Scanner s = new Scanner(System.in);
	static public void enterValueprocess(int value) {
		if(value==1) {
			ContactList.display();
		}
		else if(value==2) {
			ContactList.search();
		}
		else if(value==3) {
			ContactList.perform();
		}
	}
	static public void display() {
		System.out.println("enter 1 to dispaly all contacts");
		System.out.println("enter 2 search contact by using name");
		System.out.println("enter 3 to perform operation on contacts");

		int value = s.nextInt();
		enterValueprocess(value);
	}
	public static void main(String[] args) {
		display();
	}
}
