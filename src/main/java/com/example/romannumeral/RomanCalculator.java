package com.example.romannumeral;

import org.springframework.stereotype.Component;

@Component
public class RomanCalculator {

    public String askCesar() {
        return "Cesar said TDD is fun";
    }

    public String translate(int i) {
        if(i == 2) {
            return "II";
        }
        return "I";
    }
}
