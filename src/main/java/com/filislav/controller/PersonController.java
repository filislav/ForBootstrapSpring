package com.filislav.controller;

import com.filislav.model.Person;
import com.filislav.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService ps;

    @RequestMapping("{id}")
    public String getPerson(@PathVariable("id") String id,Model model ){
        model.addAttribute("person",ps.getPerson(id));
        return "personView";
    }
    @RequestMapping("/all")
    @ResponseBody   //когда используется то возвращается не имя шаблона а само тело ответа
    public HashMap<String,Person> getAll(){
        return ps.getAll();
    }
    @RequestMapping("/addformsave")
    public String getPerson(Person p,Model model ){
        System.out.println("Updated first name is :" +p.getFirstName());
        System.out.println("Updated last name is :" +p.getLastName());
        return "personView";
    }
}
