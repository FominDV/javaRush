package com.javarush.task.task32.task3206;


import java.lang.reflect.Proxy;

/* 
Дженерики для создания прокси-объекта
*/

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution.getProxy(Item.class));                        //true false false
        test(solution.getProxy(Item.class, Small.class));           //true false true
        test(solution.getProxy(Item.class, Big.class, Small.class));//true true true
        test(solution.getProxy(Big.class, Small.class));            //true true true т.к. Big наследуется от Item
        test(solution.getProxy(Big.class));                         //true true false т.к. Big наследуется от Item
    }


    private static void test(Object proxy) {
        boolean isItem = proxy instanceof Item;
        boolean isBig = proxy instanceof Big;
        boolean isSmall = proxy instanceof Small;

        System.out.format("%b %b %b\n", isItem, isBig, isSmall);
    }

    public <T extends Item> T getProxy(Class<T> clazz, Class<?>... interfaceClasses) {
        ClassLoader classLoader = clazz.getClassLoader();
        Class<?>[] interfaces = new Class[interfaceClasses.length+1];
        System.arraycopy(interfaceClasses, 0, interfaces, 0, interfaceClasses.length);
        interfaces[interfaces.length-1] = clazz;
        return (T)Proxy.newProxyInstance(classLoader, interfaces, new ItemInvocationHandler());
    }
}
