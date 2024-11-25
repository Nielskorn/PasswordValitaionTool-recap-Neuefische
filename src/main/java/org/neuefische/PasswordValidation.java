package org.neuefische;

public class PasswordValidation {
    public static boolean validatePasswordLength(String givenPassword) {
       return givenPassword.length()>7;
    }
}
