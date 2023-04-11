package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Password")
public class PasswordValidatorTests {

    private RegexValidator validator;

    @BeforeEach
    void setup() {
        validator = new RegexValidator();
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 518R2r5e")
    void testNamePattern2() {
        assertTrue(validator.matchesPassword("518R2r5e"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - F123456A")
    void testNamePattern3() {
        assertTrue(validator.matchesPassword("F123456A"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 1234567T")
    void testNamePattern4() {
        assertTrue(validator.matchesPassword("1234567T"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - ropsSoq0")
    void testNamePattern5() {
        assertTrue(validator.matchesPassword("ropsSoq0"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - F1234567A")
    void testNamePattern6() {
        assertFalse(validator.matchesPassword("F1234567A"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - abcdefgH")
    void testNamePattern7() {
        assertFalse(validator.matchesPassword("abcdefgH"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - abcdefg9")
    void testNamePattern9() {
        assertFalse(validator.matchesPassword("abcdefg9"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 1234567HI")
    void testNamePattern8() {
        assertFalse(validator.matchesPassword("1234567HI"));
    }
}
