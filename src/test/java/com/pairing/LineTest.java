package com.pairing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {
    private static final double EPS = 1e-9;

    @Test
    void whenPointsAreIdenticalShouldReturnZero() {
        assertEquals(0, Line.calculateLength(1, 1, 1, 1), EPS);
    }

    @Test
    void whenXAxisAreIdenticalShouldReturnCorrectLength() {
        assertEquals(3, Line.calculateLength(1, 3, 1, 6), EPS);
    }

    @Test
    void whenYAxisAreIdenticalShouldReturnCorrectLength() {
        assertEquals(5, Line.calculateLength(6, 9, 1, 9), EPS);
    }
}
