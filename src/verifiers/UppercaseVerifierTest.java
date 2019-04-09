package verifiers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UppercaseVerifierTest {

    @ParameterizedTest
    @CsvSource({
            "hosaM123,true",
            "asasdsad111,false",
    })
    void checkForNullCase(String password, boolean expected) {
        UppercaseVerifier uppercaseVerifier = new UppercaseVerifier();

        boolean actual = uppercaseVerifier.verify(password);

        assertEquals(expected, actual);
    }
}