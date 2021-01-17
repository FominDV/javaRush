package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

<<<<<<< HEAD
    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }

=======
>>>>>>> 3cbf8e0... level 17
    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
