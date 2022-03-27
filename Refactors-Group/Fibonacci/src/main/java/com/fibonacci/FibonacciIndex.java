package com.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciIndex {

    int findIndexOf(long fibonacci) {
        if (fibonacci >= 0 && fibonacci < 2) {
            return (int) fibonacci;
        }

        return generateSequence(fibonacci);
    }

    private int generateSequence(long fibonacci) {
        int indexOfFibonacci = -1;
        int currentIndex = 2;
        long f = 0;
        List<Long> sequence = buildInitialSequence();
        while (f < fibonacci) {
            f = sequence.get(currentIndex - 1) + sequence.get(currentIndex - 2);
            if (f == fibonacci)
                indexOfFibonacci = currentIndex;
            sequence.add(f);
            currentIndex++;
        }

        return indexOfFibonacci;
    }

    private List<Long> buildInitialSequence() {
        List<Long> sequence = new ArrayList<Long>();
        sequence.addAll(Arrays.asList(new Long[]{0L, 1L}));
        return sequence;
    }
}
