package com.msclient.Client;

import java.sql.Date;

public class ClientDto {

	private long id;

	private String name;

	private String surname;

	private int age;
	
	private Date dateOfBirth;
	
	private int probableDeath;

	public ClientDto(long id, String name, String surname, int age, Date dateOfBirth, int probableDeath) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.probableDeath = probableDeath;
	}

	public int getAge() {
		return age;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getProbableDeath() {
		return probableDeath;
	}
	
	public void setProbableDeath(int probableDeath) {
		this.probableDeath = probableDeath;
	}
}
