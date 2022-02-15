package ru.tokarev.springcourse.config.contorllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String gooByePage(){
        return "first/goodBye";
    }

    @GetMapping("/exit")
    public String exit(){
        return "first/exit";
    }
}
