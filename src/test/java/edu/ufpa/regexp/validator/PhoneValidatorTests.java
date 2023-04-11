package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Phone")
public class PhoneValidatorTests {

    private RegexValidator validator;

    @BeforeEach
    void setup() {
        validator = new RegexValidator();
    }

    @Test
    @DisplayName("Deve aceitar a sentença - (91) 99999-9999")
    void testNamePattern1() {
        assertTrue(validator.matchesPhone("(91) 99999-9999"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - (91) 999999999")
    void testNamePattern2() {
        assertTrue(validator.matchesPhone("(91) 999999999"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 91 999999999")
    void testNamePattern3() {
        assertTrue(validator.matchesPhone("91 999999999"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - (94)95555-5555")
    void testNamePattern4() {
        assertFalse(validator.matchesPhone("(94)95555-5555"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 99 99999-9999")
    void testNamePattern5() {
        assertFalse(validator.matchesPhone("99 99999-9999"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - (91) 59999-9999")
    void testNamePattern6() {
        assertFalse(validator.matchesPhone("(91) 59999-9999"));
    }
}
