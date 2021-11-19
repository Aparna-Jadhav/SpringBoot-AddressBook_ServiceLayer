package com.bridgelabz.address_book.service;

import java.util.List;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.model.AddressBookModel;

public interface IAddressBookService {
	
	List<AddressBookModel> getAddressBookModel();
	AddressBookModel getAddressBookModelById(int personId);
	AddressBookModel updateAddressBookModel(int personId, AddressBookDTO addressBookDTO);
	AddressBookModel createAddressBookModel(AddressBookDTO addressBookDTO);
    void deleteAddressBookModel(int personId);
	
}
