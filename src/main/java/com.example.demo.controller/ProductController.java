package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("Products", productService.listProducts());
        return "index";
    }

    @GetMapping("/addAssurance")
    public String AddForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "AddForm";
    }

    @RequestMapping(value = "/saveAssurance", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/";
    }
}
