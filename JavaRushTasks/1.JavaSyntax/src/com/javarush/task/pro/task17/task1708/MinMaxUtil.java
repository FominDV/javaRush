package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;


public class MinMaxUtil {

    public static int min(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }

    public static int min(int n1, int n2, int n3) {
        return n1 < n2 ? n1 < n3 ? n1 : n3 : n2 < n3 ? n2 : n3;
    }

    public static int min(int n1, int n2, int n3, int n4) {
       return Collections.min(new ArrayList<>(Arrays.asList(n1,n2,n3,n4)));
    }

    public static int min(int n1, int n2, int n3, int n4, int n5) {
        return Collections.min(new ArrayList<>(Arrays.asList(n1,n2,n3,n4,n5)));
    }
    //напишите тут ваш код
    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static int max(int n1, int n2, int n3) {
        return n1 > n2 ? n1 > n3 ? n1 : n3 : n2 > n3 ? n2 : n3;
    }

    public static int max(int n1, int n2, int n3, int n4) {
        return Collections.max(new ArrayList<>(Arrays.asList(n1,n2,n3,n4)));
    }

    public static int max(int n1, int n2, int n3, int n4, int n5) {
        return Collections.max(new ArrayList<>(Arrays.asList(n1,n2,n3,n4,n5)));
    }
}
