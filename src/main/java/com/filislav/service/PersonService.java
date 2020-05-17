package com.filislav.service;

import com.filislav.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Component
public class PersonService {
    private HashMap<String,Person> persons = new HashMap<>();
    public PersonService() {
        Person p = new Person();
        p.setId("1");
        p.setFirstName("Mickle");
        p.setLastName("Jackson");
        p.setAge(35);
        persons.put("1", p);

        Person p1 = new Person();
        p1.setId("2");
        p1.setFirstName("Scottie");
        p1.setLastName("Pippen");
        p1.setAge(37);
        persons.put("2", p1);
    }
        public Person getPerson(String id){
            if(persons.containsKey(id)){
                return persons.get(id);
            }
            return null;
        }
        public HashMap<String,Person> getAll(){
            return persons;
        }

}
