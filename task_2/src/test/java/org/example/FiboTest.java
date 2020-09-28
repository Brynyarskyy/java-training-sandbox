package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FiboTest {
    @Test
    public void test1() {
        assertEquals(1, Fibo.fibo(1));
    }

    @Test
    public void test2() {
        assertEquals(1, Fibo.fibo(2));
    }

    @Test
    public void test3() {
        assertEquals(2, Fibo.fibo(3));
    }

    @Test
    public void test4() {
        assertEquals(21, Fibo.fibo(8));
    }

    @Test
    public void test5() {
        assertEquals(17711, Fibo.fibo(22));
    }
}
