package com.company.model;

import java.util.*;

public class PolyLine {

    private List<Point> points = new ArrayList<Point>();

    public PolyLine() {
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }
}
