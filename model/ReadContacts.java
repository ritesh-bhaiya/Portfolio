package com.model;

public class ReadContacts {
private int id;
private String name;
private String email;
private String subject;
private String message;
public ReadContacts(int id,String name,String email,String subject,String message) {
	this.id=id;
	this.name=name;
	this.email=email;
	this.subject=subject;
	this.message=message; 
}
public int getId() { 
	return id;
	}
public String getName() { 
	return name;
	}
public String getEmail() { 
	return email;
}	
public String getSubject() {
	return subject;
}
public String getMessage() { 
	return message ;
}

}
