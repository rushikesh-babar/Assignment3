package com.assignment3.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment3.school.model.Contact;
import com.assignment3.school.service.ContactService;

@RestController
public class ContactController {
     @Autowired
	ContactService contactService;
     
     @PostMapping("/save")
     public ResponseEntity<String>saveContact(@RequestBody Contact contact){
    	 
    	 contactService.saveContact(contact);
    	 return ResponseEntity.ok("Contact Added Successfully");
     }
     
     @GetMapping("/getMessages")
     public List<Contact> getMessages(){
    	 return contactService.getMessages();
     }
    	 
     }

