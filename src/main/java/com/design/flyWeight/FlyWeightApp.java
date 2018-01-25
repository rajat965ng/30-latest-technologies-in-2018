package com.design.flyWeight;

public class FlyWeightApp {

    public static void main(String args[]){
        String[] colors = {"Red","Orange","Green","Blue"};
        int[] radius = {2,5,6,10};

        for(int i=0;i<20;i++){
            Circle circle = ShapeFactory.getCircle(colors[(int)(colors.length*Math.random())]);
            circle.setRadius(radius[(int)(radius.length*Math.random())]);
            System.out.println(circle);
        }

    }

}
