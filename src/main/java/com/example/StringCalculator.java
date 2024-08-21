package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String input) throws IllegalArgumentException{
        if (input.isEmpty()){
            return 0;
        }
        else {
            return getSum(separatedNumbers(input));
        }
    }

    private static int getSum(String[] numbers) throws IllegalArgumentException {
        findNegativeInput(numbers);
        int sum = 0;
        for(String number : numbers) {
            if (stringToInt(number) > 1000) {
                continue;
            }
            sum = sum + stringToInt(number);
        }
        return sum;
    }

    private static void findNegativeInput(String [] numbers) throws IllegalArgumentException {
        for(String number : numbers){
            if (stringToInt(number) < 0){
                throw new IllegalArgumentException("Negative numbers are not allowed");
            }
        }
    }

    private static String[] separatedNumbers(String input){
        if (input.startsWith("//")){
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
            if (matcher.matches()){
                String delimiter = matcher.group(1);
                String splitWith = matcher.group(2);
                return splitWith.split(delimiter);
            }
        }
        return input.split(",|\n");
    }

    private static int stringToInt(String input){
        return Integer.parseInt(input);
    }
}
