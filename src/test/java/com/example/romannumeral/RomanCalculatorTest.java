package com.example.romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
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

    @Test
    void it_translate_1_to_I() {
        String result = calculator.translate(1);

        Assertions.assertEquals("I", result);
    }

    @Test
    void it_translate_2_to_II() {
        String result = calculator.translate(2);

        Assertions.assertEquals("II", result);
    }

    @Test
    void it_translate_3_to_III() {
        String result = calculator.translate(3);

        Assertions.assertEquals("III", result);
    }
    @Test
    void it_translate_4_to_IV() {
        String result = calculator.translate(4);

        Assertions.assertEquals("IV", result);
    }
}
