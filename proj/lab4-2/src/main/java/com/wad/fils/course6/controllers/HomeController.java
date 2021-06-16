package com.wad.fils.course6.controllers;

import com.wad.fils.course6.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }

    @PostMapping("/register")
    public String submit(@ModelAttribute("user") User user) {

        System.out.println(user);
        System.out.println("Register succeded!");
        return "login";
    }
}
