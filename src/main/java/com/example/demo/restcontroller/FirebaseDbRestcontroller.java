package com.example.demo.restcontroller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirebaseDbRestcontroller {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value="/read", method = RequestMethod.GET)
    public Product read(@RequestParam String authkey, @RequestParam String id) {

        Product product = new Product();
        product.setAuthKey(authkey);
        product.setFirebaseId(id);

        return productRepository.read(product);
    }

}
