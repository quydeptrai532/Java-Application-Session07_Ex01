package com.example.ex01.controller;

import com.example.ex01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        try {
            String message = productService.checkSystem();
            model.addAttribute("msg", message);
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}