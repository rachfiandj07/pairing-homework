package com.pairing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {
    private static final double EPS = 1e-9;

    @Test
    void whenPointsAreIdenticalShouldReturnZero() {
        assertEquals(0, Line.calculateLength(1, 1, 1, 1), EPS);
    }
}
