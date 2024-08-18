package com.example;

import java.util.Scanner;

public class StringCalculator {


    public static int add(String s) {
        if (s.isEmpty()){
            return 0;
        }
        else {
            String [] numbers = s.split(",");
            int sum = 0;
            for(String number : numbers)
                sum = sum + Integer.parseInt(number);

            return sum;
        }
    }
}
