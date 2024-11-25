package org.neuefische;

public class PasswordValidation {
    public static boolean validatePasswordLength(String givenPassword) {
       return givenPassword.length()>7;
    }
    public static boolean validatePasswordHasDigits(String givenPassword) {
        return givenPassword.matches(".*[0-9].*");
    }
}
