package ru.dobrianskysp.task2;

import com.sun.deploy.uitoolkit.impl.awt.AWTPluginEmbeddedFrameWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {
    HashMap<Person, ArrayList> book = new HashMap();
    Person person = new Person();

    public void saveperson(String name, String phone, String email){
        Person person1 = new Person();
        person1.setdata(name, phone, email);
        System.out.println(person1.getdata(name));
        this.person = person1;
    }

    public void getnumber(String name){
        System.out.println("Номер телефона " + person.getName(name) + ": "+ person.getdata(name));
    }

}
