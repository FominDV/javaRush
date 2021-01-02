package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer,String> getProgrammingLanguages() {
        //напишите тут ваш код
        HashMap<Integer,String> programmingLanguages=new HashMap<>();
        int index=-1;
        programmingLanguages.put((index+=1),"Java");
        programmingLanguages.put((index+=1),"Kotlin");
        programmingLanguages.put((index+=1),"Go");
        programmingLanguages.put((index+=1),"Javascript");
        programmingLanguages.put((index+=1),"Typescript");
        programmingLanguages.put((index+=1),"Python");
        programmingLanguages.put((index+=1),"PHP");
        programmingLanguages.put((index+=1),"C++");
        return programmingLanguages;
    }

}
