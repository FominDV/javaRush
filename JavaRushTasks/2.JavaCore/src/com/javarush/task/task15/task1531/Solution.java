package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if(n==0) return String.valueOf(1);
        if(n<0) return String.valueOf(0);
       BigDecimal factorial=new BigDecimal(1);
            for (int i = 2; i <=n ; i++) {
                factorial=factorial.multiply(new BigDecimal(i));
                }


        return factorial.toString();
    }
}
