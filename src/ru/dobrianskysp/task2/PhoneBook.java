package ru.dobrianskysp.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList> book = new HashMap();
    Person person = new Person();

    public void saveperson(String name, String phone, String email){
        ArrayList<String> data = new ArrayList<>();
        Person person = new Person(phone, email);
        data.add(phone);
        data.add(email);
        this.book.put(name, data);
        this.person = person;
    }

    public void getnumber(String name){
        System.out.println("Номер телефона " + name + ":" + book.get(name));
    }

    public void getemail(String name){
        System.out.println("Почта " + name + ": " + person.getEmail());
    }

}
