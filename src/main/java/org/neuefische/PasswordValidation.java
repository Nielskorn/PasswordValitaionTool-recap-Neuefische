package org.neuefische;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class PasswordValidation {
    static File commonPasswords= new File(

            "src/main/resources/commonPasswords.txt");
    static Scanner scanner;

    static {
        try {
            scanner = new Scanner(commonPasswords);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validatePasswordLength(String givenPassword) {
       return givenPassword.length()>7;
    }
    public static boolean validatePasswordHasDigits(String givenPassword) {
        return givenPassword.matches(".*[0-9].*");
    }

    public static boolean validatePasswordIsMultiCase(String givenPassword) {
      String passwordLowerCase = givenPassword.toLowerCase();
      String passwordUpperCase = givenPassword.toUpperCase();
      if (passwordLowerCase.equals(givenPassword)) {
          return false;
      } else return !passwordUpperCase.equals(givenPassword);
      }


    public static boolean validatePasswordNotCommon(String givenPassword) {
    givenPassword = givenPassword.toLowerCase();
        try{

        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            if(line.contains(givenPassword)){
                return false;
            }
        }
        return true;
    }catch (Exception e){
        e.printStackTrace();
    }
    return false;
    }

    public static boolean validatePasswordHasSpecialChar(String givenPassword) {
    return givenPassword.matches("(?=.*[!@#$%^&*(),.?\":{}|<>]).*$");


}
public static  boolean validatePassword(String givenPassword) {
    boolean hasDigits=validatePasswordHasDigits(givenPassword);
    boolean hasSpecialChar=validatePasswordHasSpecialChar(givenPassword);
    boolean hasMultiCase=validatePasswordIsMultiCase(givenPassword);
    boolean isNotCommon=validatePasswordNotCommon(givenPassword);
    return hasDigits&&hasSpecialChar&&hasMultiCase&&isNotCommon;


}
}
