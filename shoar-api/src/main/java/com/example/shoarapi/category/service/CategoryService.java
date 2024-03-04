package com.example.shoarapi.category.service;

import com.example.shoarapi.category.dto.CategoryResponse;
import com.example.shoarapi.category.reposotries.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public List<CategoryResponse> getAllCategories(){
        return categoryRepository.findAll().stream().map(CategoryResponse::mapToCategoryResponse).toList();
    }
}
