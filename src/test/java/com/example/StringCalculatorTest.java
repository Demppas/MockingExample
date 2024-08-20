package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class StringCalculatorTest {


    @Test
    public void IfStringIsEmptyReturnZero() {
        int answer = StringCalculator.add("");
        assertEquals(answer, 0);
    }

    @Test
    public void IfStringContainsSingleNumberReturnItselfAsSum() {
        int answer = StringCalculator.add("1");
        assertEquals(answer, 1);
    }

    @Test
    public void IfStringContainsTwoNumbersReturnSumOfNumbers() {
        int answer = StringCalculator.add("1,5");
        assertEquals(answer, 6);
    }

    @Test
    public void IfStringContainsMultipleNumbersReturnSumOfNumbers() {
        int answer = StringCalculator.add("1,5,4");
        assertEquals(answer, 10);
    }


    @Test
    public void StringSeparatedByNewLineReturnSumOfNumbers() {
        int answer = StringCalculator.add("1\n4,4");
        assertEquals(answer, 9);
    }


    @Test
    public void NegativeNumbersAreNotAllowed(){
        assertThrows(IllegalArgumentException.class, ()-> StringCalculator.add("-1"));{
        }
    }

    @Test
    public void NumbersGreaterThenThousandAreIgnored(){
        int answer = StringCalculator.add("1000,1001,1234");
        assertEquals(answer, 1000);
    }

}