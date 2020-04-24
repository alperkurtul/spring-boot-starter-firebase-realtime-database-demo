package com.example.demo.repository;

import com.example.demo.model.Product;
import com.github.alperkurtul.firebaserealtimedatabase.annotation.FirebaseRealtimeDbRepoServiceImpl;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends FirebaseRealtimeDbRepoServiceImpl<Product, String> {
}
