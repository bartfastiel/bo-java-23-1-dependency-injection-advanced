package com.example.bojava231dependencyinjectionadvanced;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Start implements CommandLineRunner {

    private final List<GeneratesText> textGenerators;

    @Override
    public void run(String... args) {
        textGenerators.forEach(textGenerator ->
                System.out.println(textGenerator.generateWelcomeMessage())
        );
    }
}
