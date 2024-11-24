package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Contact contact1 = new Contact("Javier", "López", "111111111");
        Contact contact2 = new Contact("Carlos", "Fernández-Simón", "222222222");
        Contact contact3 = new Contact("Jose Manuel", "Soria", "333333333");
        Contact contact4 = new Contact("Santiago", "Fernández Rocha", "444444444");
        Contact contact5 = new Contact("Esteban", "Serrano del Río", "555555555");
        Contact contact6 = new Contact("Fernando Miguel Juan", "de los Santos Requejo León", "666666666");
        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        phonebook.addContact(contact4);
        phonebook.addContact(contact5);
        phonebook.addContact(contact6);
        phonebook.showPhonebook();
        phonebook.deleteContact(contact1.getCode());
        phonebook.showPhonebook();
    }
}
