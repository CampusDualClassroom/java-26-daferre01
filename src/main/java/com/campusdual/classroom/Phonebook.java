package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Phonebook {
    private Map<String,Contact> data;

    public Phonebook() {
        this.data = new HashMap<>();
    }

    public void addContact(Contact contact){
        this.data.put(contact.getCode(),contact);
    }
    public void deleteContact(String code){
        this.data.remove(code);
    }
    public void showPhonebook(){
        for(Contact contact: data.values()){
            contact.showContactDetails();
        }
    }
    public Map<String, Contact> getData() {
        return this.data;
    }
}
