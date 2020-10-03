package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerLowerTest {
    @Test
    public void test1() {
        assertTrue(BiggerLower.isBigger(2,1));
    }

    @Test
    public void test2() {
        assertTrue(BiggerLower.isBigger(5,2));
    }

    @Test
    public void test3() {
        assertTrue(BiggerLower.isBigger(3,0));
    }

    @Test
    public void test4() {
        assertTrue(BiggerLower.isLower(1,2));
    }

    @Test
    public void test5() {
        assertTrue(BiggerLower.isLower(2,7));
    }

    @Test
    public void test6() {
        assertTrue(BiggerLower.isLower(9,123));
    }
}