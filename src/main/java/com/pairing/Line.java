package com.pairing;

public class Line {

    public static double calculateLength(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return 0;
        }

        throw new RuntimeException("Calculation not supported");
    }
}
