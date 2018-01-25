package com.design.flyWeight;

public class Circle implements ICircle{

    private String color;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +", area:"+area()+
                "}";
    }
}
