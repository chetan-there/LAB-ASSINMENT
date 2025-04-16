package com.ct.EH_Day3;

public class ClassCastExceptionDemo {

   public static void handleClassCastException(){
    try {
        Object[] names = {"hello", true, "java"};
        for(int i =0 ; i < names.length ; i++){
            String s = (String) names[i];
            System.out.println("Casting successful: "+s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
   
   } 

   public static void main(String[] args) {
      handleClassCastException();
   }
}
