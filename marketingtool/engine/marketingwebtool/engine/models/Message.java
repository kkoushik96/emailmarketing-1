package com.marketing.delete.models;

public class Message
{
	private String name;
	public Message(String name) {
		this.name = name + ", thanks so much and welcome dear fresher!";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
