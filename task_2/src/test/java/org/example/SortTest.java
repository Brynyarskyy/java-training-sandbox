package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[] {1, 2, 3}, Sort.sort(new int[] {1, 2, 3}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] {1, 3, 3}, Sort.sort(new int[] {1, 3, 3}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[] {1, 2, 3, 5}, Sort.sort(new int[] {1, 2, 3, 5}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[] {1, 2, 2, 2, 3, 5, 6, 7},
                Sort.sort(new int[] {2, 2, 5, 1, 2, 6, 7, 3}));
    }



}
