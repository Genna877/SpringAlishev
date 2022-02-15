package ru.tokarev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tokarev.springcourse.dao.PersonDAO;
import ru.tokarev.springcourse.models.Person;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private PersonDAO personDAO;

    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model){
//        Получим список всех пользователей из DAO

        model.addAttribute("people",personDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){

        model.addAttribute("person",personDAO.show(id));
        return "people/show";
    }

    @GetMapping("/new")
    public String newPeople(Model model){
        model.addAttribute("person",new Person());
        return "people/new";
    }

    @PostMapping()
    public String creat(@ModelAttribute("person") Person person){
        personDAO.save(person);
        return "redirect:/people";
    }

    @GetMapping("/delete")
    public String deletePeople(Model model){
        model.addAttribute("person", new Person());
        return "people/delete";
    }

    @PostMapping()
    public String deleteName(@ModelAttribute("person") Person person){
        personDAO.delete(person);
        return "redirect:/people";
    }
}
