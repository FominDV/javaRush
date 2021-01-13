package com.javarush.task.task15.task1522;

import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
    {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        String inputKey=new Scanner(System.in).nextLine();
        if(inputKey.equals(Planet.EARTH)) thePlanet=Earth.getInstance();
        else if(inputKey.equals(Planet.MOON)) thePlanet=Moon.getInstance();
        else if(inputKey.equals(Planet.SUN)) thePlanet=Sun.getInstance();
        else thePlanet=null;
        // implement step #5 here - реализуйте задание №5 тут
    }
}
