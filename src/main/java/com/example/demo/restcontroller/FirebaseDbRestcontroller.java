package com.example.demo.restcontroller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.github.alperkurtul.firebaserealtimedatabase.bean.FirebaseSaveResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirebaseDbRestcontroller {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value="/read", method = RequestMethod.GET)
    public Product read(@RequestParam String authKey, @RequestParam String firebaseId) {

        Product product = new Product();
        product.setAuthKey(authKey);
        product.setFirebaseId(firebaseId);

        return productRepository.read(product);
    }

    @RequestMapping(value="/saveWithRandomId", method = RequestMethod.POST)
    public FirebaseSaveResponse saveWithRandomId(@RequestParam String authKey, @RequestBody Product requestBody) {

        requestBody.setAuthKey(authKey);
//        requestBody.setFirebaseId();

        return productRepository.saveWithRandomId(requestBody);
    }

    @RequestMapping(value="/saveWithSpecificId", method = RequestMethod.POST)
    public FirebaseSaveResponse saveWithSpecificId(@RequestParam String authKey, @RequestParam String firebaseId, @RequestBody Product requestBody) {

        requestBody.setAuthKey(authKey);
        requestBody.setFirebaseId(firebaseId);

        return productRepository.saveWithSpecificId(requestBody);

    }

}
