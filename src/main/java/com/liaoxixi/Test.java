package com.liaoxixi;

import org.springframework.web.bind.annotation.*;

@RestController
public class Test {

    @RequestMapping(value = "/")
    public String hello() {
        return "are you OK?";
    }

}
