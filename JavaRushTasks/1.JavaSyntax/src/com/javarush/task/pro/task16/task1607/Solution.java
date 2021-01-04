package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
        //напишите тут ваш код
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        return LocalDate.ofYearDay(2020, 256);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        return LocalDate.ofEpochDay(18517);
    }
    static long getCountOfDays(){
        Calendar targetDate=new GregorianCalendar(2020,8,13);
        return targetDate.getTime().getTime()/3600000/24;
    }
}
