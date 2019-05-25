package BajdaPawel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PostalCodesValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"00-000", "99-999", "35-021"})
    public void valid_true(String postalCode) {
        assertTrue(PostalCodesValidator.validate(postalCode));
    }
    @ParameterizedTest
    @ValueSource(strings = {"000-000", "99-99d", "35021"})
    public void valid_false(String postalCode) {
        assertFalse(PostalCodesValidator.validate(postalCode));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void nullOrEmpty(String postalCode) {
        assertFalse(PostalCodesValidator.validate(postalCode));
    }

}