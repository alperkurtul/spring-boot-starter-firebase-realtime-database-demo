package com.example.demo.restcontroller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.github.alperkurtul.firebaseuserauthentication.bean.FirebaseSignInSignUpResponseBean;
import com.github.alperkurtul.firebaseuserauthentication.service.UserAuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirebaseDbRestcontroller {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserAuthenticationServiceImpl userAuthenticationServiceImpl;

    @RequestMapping(value="/read", method = RequestMethod.GET)
    public Product read(@RequestParam String authkey, @RequestParam String id) {

        FirebaseSignInSignUpResponseBean firebaseSignInSignUpResponseBean = userAuthenticationServiceImpl.signInWithEmailAndPassword("test7@test.com", "test07");

        Product product = new Product();
        product.setAuthKey(firebaseSignInSignUpResponseBean.getIdToken());
        product.setFirebaseId(id);

        return productRepository.read(product);
    }

}
