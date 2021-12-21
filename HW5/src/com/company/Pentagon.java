package com.company;


public class Pentagon extends Figure {
    public String name = "pentagon";

    public double sideA;

    public Pentagon(double sideA ) {
        this.sideA = sideA;
    }
    int facet = 5;
    @Override
    public double getArea() {
        return facet * sideA * sideA / 4 * 1.367;   //1.367 - ctg(180-facet)
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }


}