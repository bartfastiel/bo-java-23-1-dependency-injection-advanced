package com.example.bojava231dependencyinjectionadvanced;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
public class WelcomeTextGeneratorService implements GeneratesText {

    public String generateWelcomeMessage() {
        return "Hello World";
    }
}
