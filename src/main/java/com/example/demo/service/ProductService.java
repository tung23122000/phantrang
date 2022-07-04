package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

//    Page<Product> findAllByFirstNameContaining(String name, Pageable pageable);
     Page<Product> getProducts(int pageNumber, int pageSize);
}
