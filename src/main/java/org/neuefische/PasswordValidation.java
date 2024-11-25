package org.neuefische;

public class PasswordValidation {
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
}
