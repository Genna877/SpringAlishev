package ru.tokarev.springcourse.configs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class firstController {

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/bye")
    public String byeController(@RequestParam(value = "name", required = false) String name,
                                @RequestParam(value = "surname", required = false) String surname) {

        System.out.println(name + " " + surname);

        return "first/bye";
    }

    @GetMapping("/exit")
    public String exit() {
        return "first/exit";
    }
}
