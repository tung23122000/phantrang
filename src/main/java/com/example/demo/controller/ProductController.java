package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/create")
    public Page<Product> create(@RequestParam("size") int size, @RequestParam("page") int page) {
        return service.getProducts(size,page);

    }
//
//    @GetMapping("/allList")
//    public List<Product> listAll(){
//        return repository.findAll();
//    }
//
//
//    @GetMapping("/listSp")
//    public Page<Product> ListPage(Pageable pageable){
//        return repository.findAll(pageable);
//    }
}
