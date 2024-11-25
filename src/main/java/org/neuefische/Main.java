package org.neuefische;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing
        System.out.println("Welcome to the Password Validation Program");
        System.out.println("if you what do valided a Password press the 1 \n if u want a generated password press the 2");
        Scanner scanner = new Scanner(System.in);
        int actiom=scanner.nextInt();
        scanner.nextLine();
        if(actiom==1){
        System.out.println("Please enter your password");

        String password = scanner.nextLine();
          if(  PasswordValidation.validatePassword(password)){
            System.out.println(password+"is a valid password");}
            else {
              System.out.println(password+"is not a valid password");
          }
        }
        else if (actiom==2){
            System.out.println("Please enter a desired length for your password it needs to be 8 or more");
            int length= scanner.nextInt();
            //consuming of /n because nextInt
            scanner.nextLine();
           if(length>7){
               String generatedPassword=passwordCreater.createStrongPassword(length,"");
               System.out.println( generatedPassword);
           }else {
               System.out.println("wrong length");
           }
            }
        else {
            System.out.println("not a valid Actiom");
        }
    }
}
