package com.pairing;

public class Line {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return Math.abs(y1 - y2);
        }

        throw new RuntimeException("Calculation not supported");
    }
}
