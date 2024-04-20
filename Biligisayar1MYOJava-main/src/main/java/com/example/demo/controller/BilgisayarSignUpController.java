package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarSignUpController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/signup")
    public String MainPageG(){
        System.out.println("get");
        return "signup";
    }

    @PostMapping("/signup")
    public String MainPageP(@ModelAttribute("user") UserModel user){
        System.out.println(user.getFirstName());
        userRepo.save(user); 
        return "signup";
    }
}
