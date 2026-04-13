package com.example.ex01.repository.impl;

import com.example.ex01.repository.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public String getStatus() {
        return "Kết nối Database thành công qua Repository Interface!";
    }
}