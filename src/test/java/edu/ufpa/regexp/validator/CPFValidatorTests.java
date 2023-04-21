package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("CPF")
public class CPFValidatorTests {

    private final RegexValidatorQ1 validator = new RegexValidatorQ1();;

    @Test
    @DisplayName("Deve aceitar a sentença - 123.456.789-09")
    void testNamePattern1() {
        assertTrue(validator.matchesCPF("123.456.789-09"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - 000.000.000-00")
    void testNamePattern2() {
        assertTrue(validator.matchesCPF("000.000.000-00"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 123.456.789-0")
    void testCPFPattern3() {
        assertFalse(validator.matchesCPF("123.456.789-0"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - 111.111.11-11")
    void testCPFPattern4() {
        assertFalse(validator.matchesCPF("111.111.11-11"));
    }
}
