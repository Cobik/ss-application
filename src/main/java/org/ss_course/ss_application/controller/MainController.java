package org.ss_course.ss_application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    //http://localhost:8080/main/hello?name=Sabuh
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name")String name) {

        String helloStr = "Hello " + name + "!";
        return helloStr;
    }

    //http://localhost:8080/main/surname?name=Sabuhi&surname=Karimov
    @GetMapping("/surname")
    public String sayHelloWithSurname(@RequestParam(value = "name")String name,
                                      @RequestParam(value = "surname") String surname) {

        String helloStr = "Hello " + name + " " + surname;
        return helloStr;
    }
}
