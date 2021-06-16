package com.wad.fils.course6.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public String contact(){
        return "Contact";
    }
}
