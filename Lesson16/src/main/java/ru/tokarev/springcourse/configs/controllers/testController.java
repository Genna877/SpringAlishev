package ru.tokarev.springcourse.configs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {

    @GetMapping("/testParams")
    public String testParams(HttpServletRequest request) {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        if (name == null) {
            return "test/noName";
        } else if (surname == null) {
            return "test/noSurname";
        } else {
            return "test/testParams";
        }
    }
}
