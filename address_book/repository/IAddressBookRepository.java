package com.bridgelabz.address_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.address_book.model.AddressBookModel;

public interface IAddressBookRepository extends JpaRepository<AddressBookModel, Long>{

}
