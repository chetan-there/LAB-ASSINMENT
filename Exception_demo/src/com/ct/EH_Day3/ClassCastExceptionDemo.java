package com.ct.EH_Day3;

public class ClassCastExceptionDemo {

    public static void handleClassCastException() {

        Object[] arr = { "hello", "world", "java" };

        for (Object ob : arr) {
            try {
                System.out.println("Casting sucessful : " + (String) ob);
            } catch (Exception e) {
                System.out.println("ClassCastException : Cannot cast " + ob.getClass().getName() + "to String.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        handleClassCastException();
    }
}
