package com.example.shoarapi.category.dto;

import com.example.shoarapi.category.entity.Category;
import com.example.shoarapi.category.reposotries.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoryResponse {
    private String name;
    private String thumbnail;

    public static CategoryResponse mapToCategoryResponse(Category category) {
        return new CategoryResponse(category.getNameAr(), category.getThumbnail());
    }
}
