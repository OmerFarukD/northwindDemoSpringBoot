package com.qubitfaruk.northwinddemo.api.controller;

import com.qubitfaruk.northwinddemo.business.abstracts.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    public ResponseEntity <?> getAll(){
        return new ResponseEntity<>(this.categoryService.getAll(),HttpStatus.OK);
    }
}
