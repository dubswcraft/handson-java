package com.dubswcraft.kata.roman;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTest {

    /*

    Passes all the tests
    Contains no duplication
    Clearly expresses the programmer’s intent
    Minimizes code

    */

    @Test public void testShouldConvert1ToI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(RomanNumerals.toRoman(1), "I");
    }

    @Test public void testShouldConvert2ToII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(romanNumerals.toRoman(2), "II");
    }

    @Test public void testShouldConvert3ToIII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(romanNumerals.toRoman(3), "III");
    }

    @Test public void testShouldConvert4ToIV() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(romanNumerals.toRoman(4), "IV");
    }

    @Test public void testShouldConvert36ToXXXVI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(romanNumerals.toRoman(36), "XXXVI");
    }

}
