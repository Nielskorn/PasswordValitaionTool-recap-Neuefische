import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.neuefische.PasswordValidation;


import java.util.stream.Stream;

public class passwordValidationTest {
    private final String[]testValues = {"lormIpsum","is8","c","password","assword","LYIFp1tqO8IU9aosuqBQ"};

    @ParameterizedTest
    @CsvSource({
            "true,lormIpsum",
            "false,is8",
            "false,c",
            "true,password",
            "false,assword",
            "true,LYIFp1tqO8IU9aosuqBQ"
    })

   void passwordLength_ShouldReturnTrueForPasswordWithMoreThen8Symbols(boolean expectedResult,String givenPassword) {
       Assertions.assertEquals(expectedResult, PasswordValidation.validatePasswordLength(givenPassword));
    //
    }
    @Test
    void passwordCaseCheck(){
    ;
    }
     

    }

