package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class OddTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        assertTrue(Odd.isOdd(1));
    }

    @Test
    public void test2() {
        assertTrue(!Odd.isOdd(2));
    }

    @Test
    public void test3() {
        assertTrue(Odd.isOdd(3));
    }

    @Test
    public void test4() {
        assertTrue(!Odd.isOdd(4));
    }
}
