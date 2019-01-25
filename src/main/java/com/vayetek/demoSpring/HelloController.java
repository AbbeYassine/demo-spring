package com.vayetek.demoSpring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello World !!!";
    }

    @RequestMapping("/json")
    public SimpleResponse indexJson() {
        return new SimpleResponse("Hello World");
    }
}
