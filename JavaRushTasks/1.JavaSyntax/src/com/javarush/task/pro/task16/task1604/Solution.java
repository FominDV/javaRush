package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate=new GregorianCalendar(1992,12,19);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        return switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case Calendar.MONDAY->"понедельник";
            case Calendar.TUESDAY ->"вторник";
            case Calendar.WEDNESDAY ->"среда";
            case Calendar.THURSDAY ->"четверг";
            case Calendar.FRIDAY ->"пятница";
            case Calendar.SATURDAY ->"суббота";
            case Calendar.SUNDAY ->"воскресенье";
            default -> null;
        };
    }
}
