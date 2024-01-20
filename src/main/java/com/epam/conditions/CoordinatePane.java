package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        System.out.println(x < 0 ? (y < 0 ? "third" : "fourth") : (x == 0 && y == 0 ? "zero" : (y < 0 ? "second" : "first")));
    }

}

