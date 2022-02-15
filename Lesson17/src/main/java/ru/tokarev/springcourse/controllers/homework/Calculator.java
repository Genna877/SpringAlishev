package ru.tokarev.springcourse.controllers.homework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {

    @GetMapping("/calculator")
    public String webColculetor(@RequestParam(value = "a", required = false) int a,
                                @RequestParam(value = "b", required = false) int b,
                                @RequestParam(value = "action", required = false) String action,
                                Model model) {

        double result;

        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "addition":
                result = a / b;
                break;
            default: result = 0;
        }

        model.addAttribute("result", result);

        return "/homework/calculator";
    }
}
