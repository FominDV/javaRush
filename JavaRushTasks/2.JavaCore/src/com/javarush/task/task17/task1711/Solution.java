package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if(args==null||args.length<1) throw new RuntimeException();
        SimpleDateFormat inputDateFormat=new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH), outputDataFormat=new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        int decrementedLength=args.length-1;
        int iterations, step;
        Person currentPerson=null;
        switch (args[0]){
            case "-c": synchronized (allPeople){
                step=3;
                if(decrementedLength%step!=0) throw new RuntimeException();
                iterations=decrementedLength/step;
                for (int i = 0; i < iterations; i++) {
                    try {
                        currentPerson=args[2+i*step].equals("м")? Person.createMale(args[1+i*step],inputDateFormat.parse(args[3+i*step]))
                                :Person.createFemale(args[1+i*step],inputDateFormat.parse(args[3+i*step]));
                        allPeople.add(currentPerson);
                        System.out.println(allPeople.size()-1);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }
            case "-u": synchronized (allPeople){
                step=4;
                if(decrementedLength%step!=0) throw new RuntimeException();
                iterations=decrementedLength/step;
                for (int i = 0; i < iterations; i++) {
                    try {
                        currentPerson=allPeople.get(Integer.parseInt(args[1+i*step]));
                        currentPerson.setName(args[2+i*step]);
                        currentPerson.setSex(getSexByString(args[3+i*step]));
                        currentPerson.setBirthDate(inputDateFormat.parse(args[4+i*step]));
                    }catch (ParseException e){
                        e.printStackTrace();
                    }
                }
                break;
            }
            case "-d":synchronized (allPeople) {
                for (int i = 0; i < decrementedLength; i++) {
                    currentPerson=allPeople.get(Integer.parseInt(args[1+i]));
                    currentPerson.setName(null);
                    currentPerson.setSex(null);
                    currentPerson.setBirthDate(null);
                }
                break;
            }
            case "-i": synchronized (allPeople){
                for (int i = 0; i < decrementedLength; i++) {
                    currentPerson=allPeople.get(Integer.parseInt(args[1+i]));
                    System.out.printf("%s %s %s\n",currentPerson.getName(), getStringBySex(currentPerson.getSex()),outputDataFormat.format(currentPerson.getBirthDate()));
                }
            }
        }
        //start here - начни тут
    }

    static Sex getSexByString(String sexString){
        return sexString.equals("м")? Sex.MALE:Sex.FEMALE;
    }
    static String getStringBySex(Sex sex){
        return sex==Sex.MALE? "м":"ж";
    }
}
