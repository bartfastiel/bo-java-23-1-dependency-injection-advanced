package com.example.bojava231dependencyinjectionadvanced;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class GoodbyeTextGeneratorService implements GeneratesText {

    public String generateWelcomeMessage() {
        return "Bye World";
    }
}
