package com.fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FibonacciIndexTest {

    private final int expectedIndex;
    private final long fibonacci;
    private FibonacciIndex fibonacciIndex;

    @Before
    public void setUp() {
        fibonacciIndex = new FibonacciIndex();
    }

    public FibonacciIndexTest(int expectedIndex, long fibonacci) {
        this.expectedIndex = expectedIndex;
        this.fibonacci = fibonacci;
    }


    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 0}, {1, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {49, 7778742049L}
        });
    }

    @Test
    public void findsIndexOfFibonacciNumber() {
        assertEquals(expectedIndex, fibonacciIndex.findIndexOf(fibonacci));
    }

    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {
        assertEquals(-1, fibonacciIndex.findIndexOf(7));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {
        assertEquals(-1, fibonacciIndex.findIndexOf(-1));
    }


}
