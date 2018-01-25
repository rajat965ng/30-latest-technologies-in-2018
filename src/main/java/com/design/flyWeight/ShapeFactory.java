package com.design.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = circleMap.get(color);

        if (circle==null){
            circle = new Circle(color);
            circleMap.put(color,circle);
        }

        return  circle;
    }

}
