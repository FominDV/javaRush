package com.javarush.task.pro.task16.task1601;

import java.util.Date;

public class Solution {

    static Date birthDate=new Date(92,12,19);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        switch (date.getDay()){
            case 1:
               return  "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
               return "пятница";
            case 6:
               return "суббота";
            case 0:
                return "воскресенье";
        }
        //напишите тут ваш код

        return null;
    }
}
