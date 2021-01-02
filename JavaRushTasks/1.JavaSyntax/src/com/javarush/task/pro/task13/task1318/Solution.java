package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] months=Month.values();
        int nextIndex=month.ordinal();
        if(nextIndex<months.length-1) return months[nextIndex+1];else return months[0];
        //напишите тут ваш код
    }
}
