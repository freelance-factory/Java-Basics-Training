package com.company;

import com.company.model.Point;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 7;

        p1.pointCoordinates();
        p1.pointSum(3,5);
    }
}
