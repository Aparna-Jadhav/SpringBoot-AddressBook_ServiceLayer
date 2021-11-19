package com.bridgelabz.address_book.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.address_book.dto.AddressBookDTO;

@Entity
@Table(name="addressbook")
public class AddressBookModel {
	@Id
	public int personId;
	public String fullName;
	public  String address;
	public String city;
	public long zipCode;
    public long phoneNumber;
    public String state;
	
	public AddressBookModel() {}
	
	public AddressBookModel(int personId, AddressBookDTO addressBookDTO) {
		
		this.personId = personId;
		this.fullName = addressBookDTO.fullName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zipCode = addressBookDTO.zipCode;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
