package de.thro.inf;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanTest {

    @Test
    public void testIshouldBe1() {
        assertEquals(1,Roman.romanToArabicString("I"));
    }

    @Test
    public void testIIshouldBe2() {
        assertEquals(2,Roman.romanToArabicString("II"));
    }

    @Test
    public void testIIIshouldBe3() {
        assertEquals(3,Roman.romanToArabicString("III"));
    }

    @Test
    public void testVshouldBe5() {
        assertEquals(5,Roman.romanToArabicString("V"));
    }


    @Test
    public void testVIIIshouldBe8() {
        assertEquals(8,Roman.romanToArabicString("VIII"));
    }

    @Test
    public void testXshouldBe10() {
        assertEquals(10,Roman.romanToArabicString("X"));
    }


    @Test
    public void testXIIshouldBe12() {
        assertEquals(12,Roman.romanToArabicString("XII"));
    }

    @Test
    public void testLshouldBe50() {
        assertEquals(50,Roman.romanToArabicString("L"));
    }

    @Test
    public void testIVshouldBe4() {
        assertEquals(4,Roman.romanToArabicString("IV"));
    }

    @Test
    public void testIXshouldBe9() {
        assertEquals(9,Roman.romanToArabicString("IX"));
    }
}