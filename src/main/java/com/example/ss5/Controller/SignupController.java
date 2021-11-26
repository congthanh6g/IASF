package com.example.ss5.Controller;

import com.example.ss5.Entity.ProductEntity;
import com.example.ss5.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
    @Autowired
    ProductService productService;


    @GetMapping("/signup")
    public String signup(Model model)
    {
        return "signup";
    }

    @PostMapping("/signup")
    public String Add(ProductEntity productEntity)
    {
        productService.saveProduct(productEntity);
        return "register_success";
    }






}
