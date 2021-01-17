package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args == null || args.length < 1) throw new RuntimeException();
        switch (args[0]) {
            case "-c":
                if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], covertStringToDate(args[3])));
                else allPeople.add(Person.createFemale(args[1], covertStringToDate(args[3])));
                System.out.println(allPeople.size() - 1);
                break;
            case "-u":

                Person current = allPeople.get(Integer.parseInt(args[1]));
                current.setName(args[2]);
                current.setSex(args[3].equals("м")? Sex.MALE:Sex.FEMALE);
                current.setBirthDate(covertStringToDate(args[4]));
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
            case "-i":
                Person person = allPeople.get(Integer.parseInt(args[1]));
                System.out.printf("%s %s %s", person.getName(), person.getSex().equals(Sex.MALE) ? "м" : "ж", formatter.format(person.getBirthDate()));
                break;
            default:
                System.out.println("Wrong input data: " + args);

        }
    }

    static Date covertStringToDate(String dateString) {
        Date date=null;

        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}