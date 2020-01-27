package ru.dobrianskysp.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private String phone;
    private String email;

    public Person(){
    }

    public Person(String phone, String email) {
        this.phone = phone;
        this.email = email;
        ArrayList<String> data = new ArrayList<>();
        data.add(0,phone);
        data.add(1,email);
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return phone;
    }
}
