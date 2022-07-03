package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepository repository;

    @PostMapping("/create")
    public String create(@RequestBody Product product) {
        repository.save(product);
        return "sucsefull";
    }

    @GetMapping("/allList")
    public List<Product> listAll(){
        return repository.findAll();
    }


    @GetMapping("/listSp")
    public Page<Product> ListPage(Pageable pageable){
        return repository.findAll(pageable);
    }
}
