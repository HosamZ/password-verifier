package verifiers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckerTest {
    private LengthVerifier checker = new LengthVerifier();

    @ParameterizedTest
    @CsvSource({
            "hosaM123,true",
            "sssssss,false",
            "hossam123,true",
            "null,false",
            "HOSAMm123,true",
            "ssS12,false"
    })
    void checkPasswordLength(String password, boolean expected) {
        boolean actual = checker.verify(password);

        assertEquals(expected, actual);
    }
}