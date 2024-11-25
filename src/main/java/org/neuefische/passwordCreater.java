package org.neuefische;

public class passwordCreater {
 private static final String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!?@#$%";
private   static String createPassword(int psLength){

StringBuilder stringBuilder = new StringBuilder(psLength);
    for (int i = 0; i <psLength ; i++) {
        int rand = (int) (Math.random()* characters.length());
        stringBuilder.append(characters.charAt(rand));
    }
    boolean isValid=PasswordValidation.validatePassword(stringBuilder.toString());
    if(isValid){
        return stringBuilder.toString();
    }else
       return "";

}
public static String createStrongPassword(int psLength,String vaildPassword){
   boolean isValid=false;
    while (!isValid){
        vaildPassword= passwordCreater.createPassword(psLength);
        if (!vaildPassword.isEmpty()){
            isValid=true;

        }
    }
    return vaildPassword;
}
}
