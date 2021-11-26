package com.example.ss5.Controller;

import com.example.ss5.Entity.ProductEntity;
import com.example.ss5.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class WebController {
    @Autowired
    ProductService productService;
    @GetMapping({"/" , "/index"})
    public String index(Model model)
    {
        List<ProductEntity> products = productService.getAllProduct();
        model.addAttribute("listP" , products);
        return "index";
    }

}
