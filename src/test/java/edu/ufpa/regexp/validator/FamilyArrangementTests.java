package edu.ufpa.regexp.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Arranjos Familiares")
public class FamilyArrangementTests {

    private final RegexValidatorQ2 validator = new RegexValidatorQ2();

    @Test
    @DisplayName("2.a - Deve aceitar a sentença - HMhhhmhhmhmhmmm")
    void ArrangementA1() {
        Assertions.assertTrue(validator.matchesPatternA("HMhhhmhhmhmhmmm"));
    }

    @Test
    @DisplayName("2.a - Deve aceitar a sentença - MHmmmmmhmmmm")
    void ArrangementA2() {
        Assertions.assertTrue(validator.matchesPatternA("MHmmmmmhmmmm"));
    }

    @Test
    @DisplayName("2.a - Deve aceitar a sentença - HMhhm")
    void ArrangementA3() {
        Assertions.assertTrue(validator.matchesPatternA("HMhhm"));
    }
    
    @Test
    @DisplayName("2.a - Deve rejeitar a sentença - MH")
    void ArrangementA4() {
        Assertions.assertFalse(validator.matchesPatternA("MH"));
    }

    @Test
    @DisplayName("2.a - Deve rejeitar a sentença - HMm")
    void ArrangementA5() {
        Assertions.assertFalse(validator.matchesPatternA("HMm"));
    }

    @Test
    @DisplayName("2.a - Deve rejeitar a sentença - HHhhm")
    void ArrangementA6() {
        Assertions.assertFalse(validator.matchesPatternA("HHhhm"));
    }

    @Test
    @DisplayName("2.b - Deve aceitar a sentença - MHm")
    void ArrangementB1() {
        Assertions.assertTrue(validator.matchesPatternB("MHm"));
    }

    @Test
    @DisplayName("2.b - Deve aceitar a sentença - HMhhhhhmhhhhmhhhm")
    void ArrangementB2() {
        Assertions.assertTrue(validator.matchesPatternB("HMhhhhhmhhhhmhhhm"));
    }

    @Test
    @DisplayName("2.b - Deve aceitar a sentença - MHmmmh")
    void ArrangementB3() {
        Assertions.assertTrue(validator.matchesPatternB("MHmmmh"));
    }

    @Test
    @DisplayName("2.b - Deve rejeitar a sentença - MHmmh")
    void ArrangementB4() {
        Assertions.assertFalse(validator.matchesPatternB("MHmmh"));
    }

    @Test
    @DisplayName("2.b - Deve rejeitar a sentença - HM")
    void ArrangementB5() {
        Assertions.assertFalse(validator.matchesPatternB("HM"));
    }

    @Test
    @DisplayName("2.b - Deve rejeitar a sentença - MHmmmmhhhmmhhhhhhhhmmh")
    void ArrangementB6() {
        Assertions.assertFalse(validator.matchesPatternB("MHmmmmhhhmmhhhhhhhhmmh"));
    }

    @Test
    @DisplayName("2.c - Deve aceitar a sentença - MHmhmmhhhmhhhmh")
    void ArrangementC1() {
        Assertions.assertTrue(validator.matchesPatternC("MHmhmmhhhmhhhmh"));
    }

    @Test
    @DisplayName("2.c - Deve aceitar a sentença - HMmh")
    void ArrangementC2() {
        Assertions.assertTrue(validator.matchesPatternC("HMmh"));
    }

    @Test
    @DisplayName("2.c - Deve aceitar a sentença - MHmhmmh")
    void ArrangementC3() {
        Assertions.assertTrue(validator.matchesPatternC("MHmhmmh"));
    }

    @Test
    @DisplayName("2.c - Deve rejeitar a sentença - MHhmh")
    void ArrangementC4() {
        Assertions.assertFalse(validator.matchesPatternC("MHhmh"));
    }

    @Test
    @DisplayName("2.c - Deve rejeitar a sentença - HM")
    void ArrangementC5() {
        Assertions.assertFalse(validator.matchesPatternC("HM"));
    }

    @Test
    @DisplayName("2.c - Deve rejeitar a sentença - HMmhhhm")
    void ArrangementC6() {
        Assertions.assertFalse(validator.matchesPatternC("HMmhhhm"));
    }

    @Test
    @DisplayName("2.d - Deve aceitar a sentença - HHhmhhmh")
    void ArrangementD1() {
        Assertions.assertTrue(validator.matchesPatternD("HHhmhhmh"));
    }

    @Test
    @DisplayName("2.d - Deve aceitar a sentença - MMmhhhhhhhmhhhmh")
    void ArrangementD2() {
        Assertions.assertTrue(validator.matchesPatternD("MMmhhhhhhhmhhhmh"));
    }

    @Test
    @DisplayName("2.d - Deve aceitar a sentença - MMhmmmhm")
    void ArrangementD3() {
        Assertions.assertTrue(validator.matchesPatternD("MMmhhhhhhhmhhhmh"));
    }

    @Test
    @DisplayName("2.d - Deve rejeitar a sentença - HMhmmmhm")
    void ArrangementD4() {
        Assertions.assertFalse(validator.matchesPatternD("HMhmmmhm"));
    }

    @Test
    @DisplayName("2.d - Deve rejeitar a sentença - MMhmhhm")
    void ArrangementD5() {
        Assertions.assertFalse(validator.matchesPatternD("MMhmhhm"));
    }

    @Test
    @DisplayName("2.d - Deve rejeitar a sentença - MMhhmmmh")
    void ArrangementD6() {
        Assertions.assertFalse(validator.matchesPatternD("MMhhmmmh"));
    }

    @Test
    @DisplayName("2.e - Deve aceitar a sentença - HHmhmhm")
    void ArrangementE1() {
        Assertions.assertTrue(validator.matchesPatternE("HHmhmhm"));
    }

    @Test
    @DisplayName("2.e - Deve aceitar a sentença - MMhmh")
    void ArrangementE2() {
        Assertions.assertTrue(validator.matchesPatternE("MMhmh"));
    }

    @Test
    @DisplayName("2.e - Deve aceitar a sentença - HH")
    void ArrangementE3() {
        Assertions.assertTrue(validator.matchesPatternE("HH"));
    }

    @Test
    @DisplayName("2.e - Deve rejeitar a sentença - MHhmh")
    void ArrangementE4() {
        Assertions.assertFalse(validator.matchesPatternE("MHhmh"));
    }

    @Test
    @DisplayName("2.e - Deve rejeitar a sentença - MMhmhmhmhhmh")
    void ArrangementE5() {
        Assertions.assertFalse(validator.matchesPatternE("MMhmhmhmhhmh"));
    }

    @Test
    @DisplayName("2.e - Deve rejeitar a sentença - HHmhmm")
    void ArrangementE6() {
        Assertions.assertFalse(validator.matchesPatternE("HHmhmm"));
    }

    @Test
    @DisplayName("2.f - Deve aceitar a sentença - ")
    void ArrangementF1() {
        Assertions.assertTrue();
    }

    @Test
    @DisplayName("2.f - Deve aceitar a sentença - ")
    void ArrangementF2() {
        Assertions.assertTrue();
    }

    @Test
    @DisplayName("2.f - Deve aceitar a sentença - ")
    void ArrangementF3() {
        Assertions.assertTrue();
    }

    @Test
    @DisplayName("2.f - Deve rejeitar a sentença - ")
    void ArrangementF4() {
        Assertions.assertFalse();
    }

    @Test
    @DisplayName("2.f - Deve rejeitar a sentença - ")
    void ArrangementF5() {
        Assertions.assertFalse();
    }

    @Test
    @DisplayName("2.f - Deve rejeitar a sentença - ")
    void ArrangementF6() {
        Assertions.assertFalse();
    }
/*
    @Test
    @DisplayName("2.g - Deve aceitar a sentença - ")
    void ArrangementG1() {
        Assertions.assertTrue();
    }

    @Test
    @DisplayName("2.g - Deve aceitar a sentença - ")
    void ArrangementG2() {
        Assertions.assertTrue();
    }

    @Test
    @DisplayName("2.g - Deve aceitar a sentença - ")
    void ArrangementG3() {
        Assertions.assertTrue();
    }

    @Test
    @DisplayName("2.g - Deve rejeitar a sentença - ")
    void ArrangementG4() {
        Assertions.assertFalse();
    }

    @Test
    @DisplayName("2.g - Deve rejeitar a sentença - ")
    void ArrangementG4() {
        Assertions.assertFalse();
    }

    @Test
    @DisplayName("2.g - Deve rejeitar a sentença - ")
    void ArrangementG4() {
        Assertions.assertFalse();
    }

 */
}
