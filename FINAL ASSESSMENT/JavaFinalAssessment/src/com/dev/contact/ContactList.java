package com.dev.contact;

import java.util.HashMap;
import java.util.Scanner;

public class ContactList {
	static	HashMap<String,ContactFile> hm = new HashMap<String,ContactFile>();
	static Scanner s = new Scanner(System.in);

	static void display() {
		ContactFile c = new ContactFile("suma",9902117101l,"friends");
		ContactFile c1 = new ContactFile("laxmi",8762145634l,"family");
		ContactFile c2 = new ContactFile("ganesh",990520221l,"school");
		ContactFile c3 = new ContactFile("shree",8867398345l,"official");
		hm.put(c.getName(),c);
		hm.put(c1.getName(),c1);
		hm.put(c2.getName(),c2);
		hm.put(c3.getName(),c3);
		System.out.println(hm);
		Contact.display();
	}
	static public void search() {
		System.out.println("enter name to search");
		String e = s.nextLine();
		search(e);
	}
	static public void search(String name) {
		//	if(hm.get(name)==name);
		System.out.println(hm.get(name).toString());
		operation();
	}



	static public  void operation() {
		System.out.println("press 1 to call");
		System.out.println("press 2 to message");
		System.out.println("press 3 to go back to menu");
		int value = s.nextInt();
		if(value==1) {
			call();
		}

		//	int value1 = s.nextInt();
		if(value==2) {
			message();
		}

		//	int value2 = s.nextInt();
		if(value==3) {
			goback();

		}
	}

	static public void perform() {
		System.out.println("press 1 to add contacts");
		System.out.println("press 2 to delete contacts");
		System.out.println("press 3 to update contacts");
		int i = s.nextInt();
		if(i==1) {
			add();
		}
		else if(i==2) {
			System.out.println("enter name to delete");
			String s1 =s.next() ;
			delete(s1);
		}
		else if(i==3) {
			update();
		}
	}

	static public void call() {
		System.out.println("the call is connecting....");
		//	message();
		operation();
	}

	static public void message() {
		System.out.println("enter a message");
		String m = s.next();
		System.out.println("your message is: "+m);
		operation();
	}
	static public void goback() {
		Contact.display();
	}
	static public void add() {
		System.out.println("enter name");
		String a = s.next();
		System.out.println("enter number");
		long b = s.nextLong();
		System.out.println("enter group");
		String c = s.next();

		ContactFile m=ContactFile.createObject();
		m.setName(a);
		m.setNumber(b);
		m.setGroup(c);
		//arr.add(a);
		hm.put(m.getName(),m);
		display();
	}
	static public void delete(String name) {
		ContactFile c = hm.remove(name);
		display();
	}


	static public void update() {
		System.out.println("enter name to update");
		String name = s.next();
		System.out.println("enter number to upadte");
		long number= s.nextLong();
		System.out.println("enter group to update");
		String group=s.next();
		ContactFile c1 = ContactFile.createObject();
		
		System.out.println("enter name to update");
		hm.get(name);
		c1.setName(name);
		c1.setNumber(number);
		c1.setGroup(group);

		hm.put(name, c1);	
		System.out.println(hm.put(name, c1));
		display();

	}

}
