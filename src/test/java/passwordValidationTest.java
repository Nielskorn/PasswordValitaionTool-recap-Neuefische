import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.neuefische.PasswordValidation;

public class passwordValidationTest {
    //private final String[]testValues = {"lormIpsum","is8","c","password","assword","LYIFp1tqO8IU9aosuqBQ"};

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
    @ParameterizedTest
    @CsvSource({"true,lormIpsum","false,assword","true,LYIFp1tqO8IU9aosuqBQ"
    })
    void passwordCaseCheck(boolean expectedResult, String givenPassword) {
        Assertions.assertEquals(expectedResult, PasswordValidation.validatePasswordIsMultiCase(givenPassword));

    }
    @ParameterizedTest
    @CsvSource({"false,lormIpsum",
                "true,assword1",
                "true,LYIFp1tqO8IU9aosuqBQ"

        })
    void passwordHasDigitsShouldReturnTrueForPasswordWithDigits(boolean expectedResult,String givenPassword) {
        Assertions.assertEquals(expectedResult,PasswordValidation.validatePasswordHasDigits(givenPassword));
    }
    @ParameterizedTest
    @CsvSource ({"false,password",
            "false,assword1",
            "false,12345678",
            "true,LYIFp1tqO8IU9aosuqBQ"

    })
    void validatePasswordNotCommonShouldReturnTrueIfPasswordIsNotCommon(boolean expectedResult ,String givenPassword)  {
        Assertions.assertEquals(expectedResult,PasswordValidation.validatePasswordNotCommon(givenPassword));
    }
    @ParameterizedTest
    @CsvSource ({"false,password", "false,assword1","true,1!Aa2345678","true,LYIFp1tqO8IU9aosuqBQ!"
    })
    void validatePasswordHasSpecialCharShouldReturnTruePasswordHasSpecialChar(boolean expectedResult,String givenPassword) {
        Assertions.assertEquals(expectedResult,PasswordValidation.validatePasswordHasSpecialChar(givenPassword));
    }

    }

