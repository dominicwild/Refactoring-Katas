package com.sorter;

import com.sorter.SortKind;
import com.sorter.Sorter;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SorterTests {

    @Test
    public void bubblesortPutsArrayInAscendingOrder() {
        int[] array = {3, 1, 2};
        array = new Sorter().sort(SortKind.BUBBLE, array);
        assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void quicksortPutsArrayInAscendingOrder() {
        int[] array = {3, 1, 2};
        array = new Sorter().sort(SortKind.QUICK, array);
        assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void insertionsortPutsArrayInAscendingOrder() {
        int[] array = {3, 1, 2};
        array = new Sorter().sort(SortKind.INSERTION, array);
        assertArrayEquals(new int[]{1, 2, 3}, array);
    }

}
