package org.ss_course.ss_application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name")String name) {

        String helloStr = "Hello " + name + "!";
        return helloStr;
    }
}
