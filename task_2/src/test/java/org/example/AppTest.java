package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        assertTrue(App.isOdd(1));
    }

    @Test
    public void test2() {
        assertTrue(!App.isOdd(2));
    }

    @Test
    public void test3() {
        assertTrue(App.isOdd(3));
    }

    @Test
    public void test4() {
        assertTrue(!App.isOdd(4));
    }
}
