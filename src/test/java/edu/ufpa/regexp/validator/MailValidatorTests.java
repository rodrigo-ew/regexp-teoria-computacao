package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Mail")
public class MailValidatorTests {

    private final RegexValidatorQ1 validator = new RegexValidatorQ1();;

    @Test
    @DisplayName("Deve aceitar a sentença - a@a.br")
    void testNamePattern1() {
        assertTrue(validator.matchesMail("a@a.br"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - divulga@ufpa.br")
    void testNamePattern2() {
        assertTrue(validator.matchesMail("divulga@ufpa.br"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - a@a.com.br")
    void testNamePattern3() {
        assertTrue(validator.matchesMail("a@a.com.br"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - @")
    void testNamePattern4() {
        assertFalse(validator.matchesMail("@"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - a@.br")
    void testNamePattern5() {
        assertFalse(validator.matchesMail("a@.br"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - T@teste.br")
    void testNamePattern6() {
        assertFalse(validator.matchesMail("T@teste.br"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - a@A.com.br")
    void testNamePattern7() {
        assertFalse(validator.matchesMail("a@A.com.br"));
    }

    @Test
    @DisplayName("Deve rejeitar a sentença - @a.br")
    void testNamePattern8() {
        assertFalse(validator.matchesMail("@a.br"));
    }

}
