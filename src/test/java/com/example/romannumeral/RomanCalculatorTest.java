package com.example.romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanCalculatorTest {

    @Autowired
    RomanCalculator calculator;

    @Test
    void it_call_caesar() {
        String cesarAnswer = calculator.askCesar();

        Assertions.assertEquals("Cesar said TDD is fun", cesarAnswer);
    }
}
