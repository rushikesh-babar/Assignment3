package com.assignment3.school.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.assignment3.school.model.Contact;

@Repository
public class ContactDao {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveContact(Contact contact){
	String sql="insert into contact (name,mobile,message) values (?,?,?)";
	return jdbcTemplate.update(sql,contact.getName(),contact.getMobile(),contact.getMessage());
	}
	
}
