package com.example;

import java.util.Scanner;

public class StringCalculator {

    public static final String REGEX = ",";

    public static String calculate(String... input){
        int sum = 0;
        for (String s : input) {
            sum = sum + checkInput(s);
        }
        return String.valueOf(sum);
    }
    private static int checkInput(String s) {
        if (s.isEmpty()){
            return 0;
        }
        else {
            String [] numbers = s.split(REGEX);
            return add(numbers);
        }
    }

    private static int add(String[] numbers) {
        int sum = 0;
        for(String number : numbers)
            sum = sum + Integer.parseInt(number);
        return sum;
    }
}
