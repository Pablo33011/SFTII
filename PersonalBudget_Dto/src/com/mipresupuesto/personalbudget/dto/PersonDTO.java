package com.mipresupuesto.personalbudget.dto;

public final class PersonDTO {
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String lastName;
	private String completeName;
	
	public PersonDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		setCompleteName("");
		
	}
	private final String getId() {
		return id;
	}
	private final void setId(String id) {
		this.id = id;
	}
	private final String getIdCard() {
		return idCard;
	}
	private final void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	
	public final String getFirstName() {
		if (firstName== null || "".equals(firstName.trim())) {
			setFirstName("");
		}
		
		return firstName;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final String getMiddleName() {
		if (middleName== null || "".equals(middleName.trim())) {
			setMiddleName("");
		}
		return middleName;
	}
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public final String getFirstSurname() {
		if (getFirstSurname()== null || "".equals(firstSurname.trim())) {
			setFirstSurname("");
		}
		return firstSurname;
	}
	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public final String getSecondSurname() {
		if (secondSurname== null || "".equals(secondSurname.trim())) {
			setSecondSurname("");
		}
		return secondSurname;
	}
	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public final String getName() {
		return (getFirstName()+ " " + getMiddleName()).trim();
	}
	public final String getCompleteName() {
		return getName () + "" + getLastName();
	}
	public final String getLastName() {
		return lastName;
	}
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}
	
}
