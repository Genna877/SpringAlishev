package ru.tokarev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TwoController {

    @GetMapping("/exit")
    public String exit(){
        return "two/exit";
    }
}
