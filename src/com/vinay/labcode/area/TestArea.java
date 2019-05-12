package com.vinay.labcode.area;

public class TestArea {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        Area area;
        area = rect;
        System.out.println("Area of Rectangle = "+area.compute(10,20));
        area = circle;
        System.out.println("Area of Rectangle = "+area.compute(30,0));
    }
}
