package com.design.facade;

public class StepImpl {

    private IStep rectangle;

    private IStep circle;

    private IStep square;

    public StepImpl() {
        rectangle = ()->{
            System.out.println("Drawn Rectangle");
        };
        circle = ()->{
            System.out.println("Drawn Circle");
        };
        square = ()->{
            System.out.println("Drawn Square");
        };
    }

    public void drawRectangle(){
        rectangle.plan();
    }

    public void drawSquare(){
        square.plan();
    }
    public void drawCircle(){
        circle.plan();
    }
}
