package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LatinNumbersTest {
    @Test
    public void test1() {
        assertEquals(1, LatinNumbers.convert("I"));
    }

    @Test
    public void test2() {
        assertEquals(10, LatinNumbers.convert("X"));
    }

    @Test
    public void test3() {
        assertEquals(15, LatinNumbers.convert("XV"));
    }

    @Test
    public void test4() {
        assertEquals(23, LatinNumbers.convert("XXIII"));
    }

    @Test
    public void test5() {
        assertEquals(146, LatinNumbers.convert("CXLVI"));
    }

    @Test
    public void test6() {
        assertEquals(444, LatinNumbers.convert("CDXLIV"));
    }
}
