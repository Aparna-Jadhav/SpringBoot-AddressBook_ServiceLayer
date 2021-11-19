package com.bridgelabz.address_book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.model.AddressBookModel;
import com.bridgelabz.address_book.repository.IAddressBookRepository;



@Service
public class AddressBookService implements IAddressBookService{

	@Autowired
	IAddressBookRepository addressBookRepository;
	
	List<AddressBookModel> addressBookList = new ArrayList<>();
	
	@Override
	public List<AddressBookModel> getAddressBookModel() {
//		List<AddressBookModel> addressBookList= new ArrayList<>();
//		addressBookList.add(new AddressBookModel(1 , new AddressBookDTO("Aparna", "Jadhav", "Ambegoan", "Pune", "MH", "aparna@gmail.com", 9012345) ));
		return addressBookList;
	}

	@Override
	public AddressBookModel getAddressBookModelById(int personId) {
//		AddressBookModel addressBookModel=null;
//		addressBookModel= new AddressBookModel(1, new AddressBookDTO("Aparna", "Jadhav", "Ambegoan", "Pune", "MH", "aparna@gmail.com", 9012345));
		return addressBookList.get(personId-1);
	}
	
	@Override
	public AddressBookModel createAddressBookModel(AddressBookDTO addressBookDTO) {
		AddressBookModel addressModel=null;
		addressModel = new AddressBookModel(addressBookList.size()+1, addressBookDTO);
		addressBookList.add(addressModel);
		return addressModel;
	}

	@Override
	public AddressBookModel updateAddressBookModel(int personId, AddressBookDTO addressBookDTO) {
//		AddressBookModel addressModel=null;
//		addressModel = new AddressBookModel(1, addressBookDTO);
		AddressBookModel addressModel=this.getAddressBookModelById(personId);
		addressModel.setFullName(addressBookDTO.fullName);
		addressModel.setAddress(addressBookDTO.address);
		addressModel.setCity(addressBookDTO.city);
		addressModel.setState(addressBookDTO.state);
		addressModel.setZipCode(addressBookDTO.zipCode);
		addressModel.setPhoneNumber(addressBookDTO.phoneNumber);
		addressBookList.set(personId-1, addressModel);
		return addressModel;
	}

	@Override
	public void deleteAddressBookModel(int personId) {
//		AddressBookModel addressModel = this.getAddressBookModelById(Zip);
//		addressBookRepository.delete(addressModel);
       addressBookList.remove(personId-1);
	}

}
