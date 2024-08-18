package com.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class StringCalculatorTest {


    @Test
    public void IfStringIsEmptyReturnZero(){
        int answer = StringCalculator.add("");
        assertEquals(answer,0);
    }

    @Test
    public void IfStringContainsSingleNumberReturnItselfAsSum(){
        int answer = StringCalculator.add("1");
        assertEquals(answer, 1);
    }

    @Test
    public void IfStringContainsMultipleNumbersReturnSumOfNumbers(){
        int answer = StringCalculator.add("1,5");
        assertEquals(answer, 6);
    }
}