package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Name")
class NameValidatorTests {

    private RegexValidator validator;

    @BeforeEach
    void setup() {
        validator = new RegexValidator();
    }

    @Test
    @DisplayName("Deve aceitar a sentença - Ada Lovelace")
    void testNamePattern1() {
        assertTrue(validator.matchesName("Ada Lovelace"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - Stephen Cole Kleene")
    void testNamePattern2() {
        assertTrue(validator.matchesName("Stephen Cole Kleene"));
    }

    @Test
    @DisplayName("Deve aceitar a sentença - Alan Turing")
    void testNamePattern3() {
        assertTrue(validator.matchesName("Alan Turing"));
    }

    @Test
    @DisplayName("Não deve aceitar a sentença - 1Alan")
    void testNamePattern4() {
        assertFalse(validator.matchesName("1Alan"));
    }

    @Test
    @DisplayName("Não deve aceitar a sentença - Alan")
    void testNamePattern5() {
        assertFalse(validator.matchesName("Alan"));
    }

    @Test
    @DisplayName("Não deve aceitar a sentença - A1an")
    void testNamePattern6() {
        assertFalse(validator.matchesName("A1an"));
    }

    @Test
    @DisplayName("Não deve aceitar a sentença - A1an Turing")
    void testNamePattern7() {
        assertFalse(validator.matchesName("Al1an Turing"));
    }

    @Test
    @DisplayName("Não deve aceitar a sentença - Stephen Cole Kleene")
    void testNamePattern8() {
        assertFalse(validator.matchesName("Alan turing"));
    }

}