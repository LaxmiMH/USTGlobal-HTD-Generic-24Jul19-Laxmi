package com.dev.contact;

public class ContactFile {
	private String name;
	private long number;
	private String group;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	ContactFile(String name,long number,String group){
		this.name=name;
		this.number=number;
		this.group=group;

	}
	@Override
	public String toString() {
		return "ContactFile [name=" + name + ", number=" + number + ", group=" + group + "]";
	}
	static public ContactFile createObject() {
		ContactFile i = new ContactFile();
		return i;
	}
	ContactFile(){}
}
