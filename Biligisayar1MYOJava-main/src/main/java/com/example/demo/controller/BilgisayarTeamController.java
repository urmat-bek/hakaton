package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarTeamController {

    @GetMapping ("/team.html")
    public String mainPageG(){
        return "team";
    }

    @PostMapping("/team.html")
    public String mainPageP(String name, String cardNumber, String email){
        System.out.println(name+" "+cardNumber+" "+email);
        return "team";
    }

}
