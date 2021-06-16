package com.wad.fils.course6.controllers;


import com.wad.fils.course6.services.ProductSV;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/shop")
public class ShopController {
    //like display all product from prev labs

    private final ProductSV productSV;

    public ShopController(ProductSV productSV) {
        this.productSV = productSV;
    }


    @GetMapping
    public String shop(Model model){
        model.addAttribute("products",productSV.findAll());
        return "Shop";
    }
}
