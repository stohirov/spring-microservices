package com.example.product_service.service;

import com.example.product_service.payload.CategoryReqDTO;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

    ResponseEntity<?> getById(Long id);

    ResponseEntity<?> getAll();

    ResponseEntity<?> add(CategoryReqDTO categoryReqDTO);

}
