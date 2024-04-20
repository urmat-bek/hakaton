package com.example.demo.controller;

import com.example.demo.model.MainModel;
import com.example.demo.repo.MainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarMainController {
    @Autowired
    private MainRepo mainRepo;

    @GetMapping
    public String mainPageG() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        System.out.println(name);
        return "index";
    }

    @PostMapping("/")
    public String mainPageP(String login, String password) {
        mainRepo.save(new MainModel(login, password));
        return "index";
    }

//    @PostMapping("/")
//    public String signUpPage(String name, String surname, String email, String password){
////      mainRepo.save(new RegModel(name, surname, email, password));
//
//        return "index";
//    }

}
