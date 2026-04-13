package com.example.ex01.service.impl;

import com.example.ex01.repository.ProductRepository;
import com.example.ex01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String checkSystem() {
        return productRepository.getStatus();
    }
}