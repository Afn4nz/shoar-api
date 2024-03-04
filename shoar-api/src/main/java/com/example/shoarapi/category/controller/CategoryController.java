package com.example.shoarapi.category.controller;

import com.example.shoarapi.category.service.CategoryService;
import com.example.shoarapi.common.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.Categories.CATEGORIES_PREFIX)
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping(Constants.Categories.GET_ALL_CATEGORIES)
    public ResponseEntity<?> getAllCategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }
}