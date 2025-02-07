package com.example.product_service.service;

import com.example.product_service.entity.Category;
import com.example.product_service.payload.CategoryReqDTO;
import com.example.product_service.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ResponseEntity<?> getById(Long id) {
        Optional<Category> optionalCategory = findById(id);

        return null;
    }

    @Override
    public ResponseEntity<?> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<?> add(CategoryReqDTO categoryReqDTO) {
        return null;
    }

    private Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

}
