package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
<<<<<<< HEAD
        synchronized (IMF.class){
            if(imf==null)
            imf=new IMF();
        }
=======
>>>>>>> 3cbf8e0... level 17
        //add your code here - добавь код тут
        return imf;
    }

    private IMF() {
    }
}
