package com.example.demo.service.impl;

import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;
//    @Override
//    public Page<Product> findAllByFirstNameContaining(String name, Pageable pageable) {
//        return repository.findAllByFirstNameContaining(name, pageable);
//    }
}
