package com.javarush.task.task17.task1706;

/* 
Синхронизированный президент
*/

public class Solution {
<<<<<<< HEAD
    
=======
>>>>>>> 3cbf8e0... level 17
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}
