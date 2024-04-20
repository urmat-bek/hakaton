package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarWhyController {

    @GetMapping ("/why.html")
    public String mainPageG(){
        return "why";
    }

    @PostMapping("/why.html")
    public String mainPageP(String name, String cardNumber, String email){
        System.out.println(name+" "+cardNumber+" "+email);
        return "why";
    }

}
