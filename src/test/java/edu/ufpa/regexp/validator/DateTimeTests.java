package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("DateTime")
public class DateTimeTests {

    private final RegexValidatorQ1 validator = new RegexValidatorQ1();

    @Test
    @DisplayName("Deve aceitar a sentença - 31/08/2019 20:14:55")
    void testNamePattern1() {
        assertTrue(validator.matchesDateTime("31/08/2019 20:14:55"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 99/99/9999 23:59:59")
    void testNamePattern2() {
        assertTrue(validator.matchesDateTime("99/99/9999 23:59:59"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 99/99/9999 3:9:9")
    void testNamePattern10() {
        assertFalse(validator.matchesDateTime("99/99/9999 3:9:9"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 9/9/99 99:99:99")
    void testNamePattern11() {
        assertFalse(validator.matchesDateTime("9/9/99 99:99:99"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 99/99/999903:09:09")
    void testNamePattern12() {
        assertFalse(validator.matchesDateTime("99/99/999903:09:09"));
    }
    /*
    @BeforeEach
    public void*/
}
