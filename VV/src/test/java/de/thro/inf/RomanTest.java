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

    @Test
    public void testIIIIshouldBeFalse() {
        assertEquals(-1,Roman.romanToArabicString("IIII"));
    }

    @Test
    public void testVIIIIshouldBeFalse() {
        assertEquals(-1,Roman.romanToArabicString("VIIII"));
    }

    @Test
    public void testVVIIIshouldBeFalse() {
        assertEquals(-1,Roman.romanToArabicString("VVIII"));
    }

    @Test
    public void testXXXXshouldBeFalse() {
        assertEquals(-1,Roman.romanToArabicString("XXXX"));
    }

    @Test
    public void testXCshouldBeFalse() {
        assertEquals(90,Roman.romanToArabicString("XC"));
    }

    @Test
    public void testCCshouldBeFalse() {
        assertEquals(200,Roman.romanToArabicString("CC"));
    }

    @Test
    public void testLXXXIIIshouldBeFalse() {
        assertEquals(83,Roman.romanToArabicString("LXXXIII"));
    }

    @Test
    public void testLXXXIVshouldBeFalse() {
        assertEquals(84,Roman.romanToArabicString("LXXXIV"));
    }

    @Test
    public void testLXXXIIshouldBeFalse() {
        assertEquals(82,Roman.romanToArabicString("LXXXII"));
    }
}