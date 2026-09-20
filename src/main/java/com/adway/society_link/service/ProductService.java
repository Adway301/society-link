package com.adway.society_link.service;

import com.adway.society_link.model.Product;
import com.adway.society_link.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAll() {
        return repo.findAll();
    }
}
