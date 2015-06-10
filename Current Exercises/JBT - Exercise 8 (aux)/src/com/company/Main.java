package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new ResizableCircle(4);

        c1.getPerimeter();
        c1.getArea();

        ResizableCircle r1 = (ResizableCircle) c1;
        r1.resize(-35);
        r1.getPerimeter();
        r1.getArea();

    }
}
