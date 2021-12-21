package com.company;

public class MainHW5 {

    public static void main(String[] args) {

        Rectangle rectagle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(3);
        Pentagon pentagon = new Pentagon(3);

        System.out.println("Фігура        Площа");
        System.out.println(rectagle.getName() + "    " + rectagle.getArea());
        System.out.println(triangle.getName() + "      " + triangle.getArea());
        System.out.println(circle.getName() + "        " + circle.getArea());
        System.out.println(pentagon.getName() + "      " + pentagon.getArea());


    }

}