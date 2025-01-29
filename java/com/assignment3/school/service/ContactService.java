package com.assignment3.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment3.school.dao.ContactDao;
import com.assignment3.school.model.Contact;

@Service
public class ContactService {
    @Autowired
	ContactDao contactDao;
    
    public int saveContact(Contact contact) {
    	
    	return contactDao.saveContact(contact);
    }
	
}
