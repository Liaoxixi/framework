package com.liaoxixi.main.controller.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/helloWorld")
    public String hello() {
        return "are you OK?";
    }

}
