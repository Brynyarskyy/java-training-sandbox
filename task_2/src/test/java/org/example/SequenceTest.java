package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {
    @Test
    public void test1() {
        assertTrue(Sequence.isValid(new int[] {1, 2, 3}));
    }

    @Test
    public void test2() {
        assertTrue(Sequence.isValid(new int[] {1, 3, 51}));
    }

    @Test
    public void test3() {
        assertFalse(Sequence.isValid(new int[] {1, 3, 2}));
    }

    @Test
    public void test4() {
        assertTrue(Sequence.isValid(new int[] {1, 2, 2, 2, 6, 6, 6, 51, 67, 67}));
    }

    @Test
    public void test5() {
        assertFalse(Sequence.isValid(new int[] {1, 2, 2, 2, 6, 5, 6, 51, 67, 67}));
    }

}
