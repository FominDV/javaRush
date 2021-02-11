package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {

        int rectangleCount=0;
        int length = a.length;
        List<String> list = new ArrayList<>();
        String cell;
        boolean isRectangle = false;
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
               cell=i+" "+j;
                if (a[i][j] == 1 && (!list.contains(i+" "+j))) {
                    isRectangle = true;
                    list.add(cell);
                    for (int k = i + 1; k < length; k++) {
                        if (a[k][j] == 1) list.add(k+" "+j);
                        else k = length;
                    }
                } else {
                    if (isRectangle){
                        isRectangle=false;
                        rectangleCount++;
                    }
                }
            }
            if(isRectangle){
                isRectangle=false;
                rectangleCount++;
            }
        }

        return rectangleCount;
    }

}
