package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String key;
        List<Movie> list=new ArrayList<>();
        do {
            key=in.readLine();
            Movie movie;
            if((movie=MovieFactory.getMovie(key))!=null)list.add(movie);
        }while (key.equals("soapOpera")||key.equals("cartoon")||key.equals("thriller"));
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        list.forEach(movie -> System.out.println(movie.getClass().getSimpleName()));
        in.close();
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))  movie = new SoapOpera();
            else if(key.equals("cartoon")) movie=new Cartoon();
            else if(key.equals("thriller")) movie=new Thriller();

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }
}
