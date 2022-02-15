package ru.tokarev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("message", "Hello, " + " " + name);
        return "first/hello";
    }

    @GetMapping("/bye")
    public String byePage(){
        return "first/bye";
    }
}
