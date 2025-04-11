package com.ct.lambda.lambda_day1;


import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {

    public static void main(String[] args)
    {
         String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String lower = "abcdefghijklmnopqrstuvwxyz";
         String digits = "0123456789";
         String special = "@#$%!&*";      //69 characters
         
         String totalChar = upper + lower + digits + special;
         
         Supplier<String> pwdSupplier =   () ->
         {
            Random random = new Random();
            String password = "";
           
            for(int i=0; i<8; i++)
            {
                int index = random.nextInt(totalChar.length());
                password = password + totalChar.charAt(index);
            }        
             
             return password;
         };
         
         String pwd = pwdSupplier.get();

         System.out.println("Generated password :"+pwd);


    }

}