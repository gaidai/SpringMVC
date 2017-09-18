package com.sgaidai.springmvc;

import java.util.List;


public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
