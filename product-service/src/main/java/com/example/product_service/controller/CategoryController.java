package com.example.product_service.controller;

import com.example.product_service.payload.CategoryReqDTO;
import com.example.product_service.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category/")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("{id}")
    ResponseEntity<?> getById(@RequestParam("id") Long id) {
        return categoryService.getById(id);
    }

    @GetMapping()
    ResponseEntity<?> getAll() {
        return categoryService.getAll();
    }

    @PostMapping
    ResponseEntity<?> add(@RequestBody CategoryReqDTO categoryReqDTO) {
        return categoryService.add(categoryReqDTO);
    }

}
