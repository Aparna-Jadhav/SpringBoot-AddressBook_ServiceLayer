package com.bridgelabz.address_book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.dto.ResponseDTO;
import com.bridgelabz.address_book.model.AddressBookModel;
import com.bridgelabz.address_book.service.AddressBookService;
import com.bridgelabz.address_book.service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@Autowired
	IAddressBookService addressBookService;
	
	@RequestMapping(value = { "", "/", "/get" })
	 public ResponseEntity<ResponseDTO> getAddressBookModel() {
		List<AddressBookModel> addressDataList=null;
		addressDataList = addressBookService.getAddressBookModel();
        ResponseDTO responseDTO = new ResponseDTO("GET call is Successful", addressDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
	
	@GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookModel(@PathVariable("personId") int personId) {
		AddressBookModel addressBookModel;
        addressBookModel = addressBookService.getAddressBookModelById(personId);
        ResponseDTO responseDTO = new ResponseDTO("Get Call for ID Successfull ", addressBookModel);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
	
	@PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookModel(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel = null;
        addressBookModel = addressBookService.createAddressBookModel(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Address book Data Successfully", addressBookModel);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
	
	@PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookModel(@PathVariable("personId")int personId,
    		@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookModel addressBookModel = null;
		addressBookModel = addressBookService.updateAddressBookModel(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Address book Data Successfully", addressBookModel);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
	
	@DeleteMapping("/delete/{personId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookModel(@PathVariable("personId")int personId)
	{
		addressBookService.deleteAddressBookModel(personId);
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted Id : " + personId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
		
	}
}
