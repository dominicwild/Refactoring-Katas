package com.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciIndex {

    public static final int STARTING_INDEX = 2;
    public static final int FIB_NUMBER_1 = 0;
    public static final int FIB_NUMBER_2 = 2;
    private final List<Long> sequence;

    FibonacciIndex() {
        sequence = buildInitialSequence();
    }

    int findIndexOf(long fibonacciNumber) {
        if (isBelowFirstTwoFibonacciNumbers(fibonacciNumber)) {
            return (int) fibonacciNumber;
        }

        return getFibonacciNumber(fibonacciNumber);
    }

    private boolean isBelowFirstTwoFibonacciNumbers(long fibonacciNumber) {
        return fibonacciNumber >= FIB_NUMBER_1 && fibonacciNumber < FIB_NUMBER_2;
    }

    private int getFibonacciNumber(long targetFibonacciNumber) {
        int indexOfFibonacci = -1;
        int currentIndex = STARTING_INDEX;
        long fibonacciNumber = 0;
        while (fibonacciNumber < targetFibonacciNumber) {
            fibonacciNumber = getFibonacciNumber(currentIndex);

            if (fibonacciNumber == targetFibonacciNumber)
                indexOfFibonacci = currentIndex;

            currentIndex++;
        }

        return indexOfFibonacci;
    }

    private long getFibonacciNumber(int currentIndex) {
        long fibonacciNumber = sequence.get(currentIndex - 1) + sequence.get(currentIndex - 2);
        sequence.add(fibonacciNumber);

        return fibonacciNumber;
    }

    private List<Long> buildInitialSequence() {
        return new ArrayList<>(Arrays.asList(0L, 1L));
    }
}
