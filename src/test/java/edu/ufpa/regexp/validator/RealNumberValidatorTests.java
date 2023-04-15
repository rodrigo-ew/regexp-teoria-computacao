package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Real Number")
public class RealNumberValidatorTests {

    RegexValidatorQ1 validator;

    @BeforeEach
    void setup() {
        validator = new RegexValidatorQ1();
    }

    @Test
    @DisplayName("Deve aceitar a sentença - -25.467")
    void testNumberPattern1() {
        assertTrue(validator.matchesRealNumber("-25.467"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 1")
    void testNumberPattern2() {
        assertTrue(validator.matchesRealNumber("1"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - +1")
    void testNumberPattern3() {
        assertTrue(validator.matchesRealNumber("+1"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 64.2")
    void testNumberPattern4() {
        assertTrue(validator.matchesRealNumber("64.2"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - -1")
    void testNumberPattern5() {
        assertTrue(validator.matchesRealNumber("-1"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 1.")
    void testNumberPattern6() {
        assertFalse(validator.matchesRealNumber("1."));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - .2")
    void testNumberPattern7() {
        assertFalse(validator.matchesRealNumber(".2"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - +64,2")
    void testNumberPattern8() {
        assertFalse(validator.matchesRealNumber("+64,2"));
    }
}
