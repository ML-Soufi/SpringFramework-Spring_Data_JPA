package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/editAssurance/{id}")
    public String editForm(Model model, @PathVariable Integer id){
        Optional<Product> prc = productService.getProductById(id);
        Product product = prc.get();
        model.addAttribute("product", product);
        return "editForm";
    }

    @PostMapping("/updateAssurance/{id}")
    public String updateProduct(@ModelAttribute("product") Product product, @PathVariable Integer id){
        Optional<Product> prc = productService.getProductById(id);
        Product NEWproduct = prc.get();
        NEWproduct.setName(product.getName());
        NEWproduct.setDescription(product.getDescription());
        NEWproduct.setCost(product.getCost());
        productService.addProduct(NEWproduct);
        return "redirect:/";
    }

    @GetMapping("/deleteAssurance/{id}")
    public String updateProduct( @PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
