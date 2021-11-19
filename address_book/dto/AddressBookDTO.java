package com.bridgelabz.address_book.dto;

public class AddressBookDTO {
	
	public int personId;
    public String fullName;
    public  String address;
    public String city;
    public String state;
    public long zipCode;
    public long phoneNumber;
   
    
    public AddressBookDTO(String fullName, String address, String city, String state, long zipCode, long phoneNumber) {
		
		//this.Zip = zip;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "AddressBookDTO [personId=" + personId + ", fullName=" + fullName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
	}

	

		
}
