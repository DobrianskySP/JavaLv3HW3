package ru.dobrianskysp.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    String name;
    ArrayList<String> data = new ArrayList<>();
    HashMap<String,ArrayList> person = new HashMap<>();

    public Person() {
    }

    public String getName(String name) {
        this.name = name;
        return this.name;
    }

    public void setdata(String name, String number, String email){
        this.data.add(number);
        this.data.add(email);
        this.person.put(name, data);
    }

    public ArrayList getdata(String person){
        return this.person.get(person);
    }

    @Override
    public String toString() {
        return name;
    }
}
