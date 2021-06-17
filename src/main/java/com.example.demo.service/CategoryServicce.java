package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServicce {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Category> getCategoryById(Integer id){ return categoryRepository.findById(id); }

    public Category addCategory(Category category){
        return categoryRepository.save(category);
    }

}
