package com.filislav.controller;

import com.filislav.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping ("/person")
    public String person(Model model){
        Person p = new Person();
        p.setFirstName("Joe");
        p.setLastName("Clarke");
        p.setAge(30);
        model.addAttribute("person",p);
        return "personView";
    }

    @GetMapping("/")
    public String home(){
        return "homeView";
    }
}
