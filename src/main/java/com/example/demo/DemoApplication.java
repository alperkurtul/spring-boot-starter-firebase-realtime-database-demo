package com.example.demo;

import com.github.alperkurtul.firebaserealtimedatabase.annotation.EnableFirebaseRealtimeDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFirebaseRealtimeDatabase
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
