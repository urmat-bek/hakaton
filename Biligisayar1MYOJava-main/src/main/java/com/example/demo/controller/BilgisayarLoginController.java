package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class BilgisayarLoginController {
//
//    @GetMapping ("/login")
//    public String mainPageG(){
//        return "login";
//    }
//
//    @PostMapping("/login")
//    public String mainPageP(String login, String password){
//        System.out.println(login+" "+password);
//
//        return "login";
//    }
//
//
//}


import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BilgisayarLoginController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Возвращаем страницу входа
    }

}

