package com.design.template;

public class TemplateApp {

    public static void main(String args[]){
        RobotTemplate robotTemplate = new AutomotiveRobot();
        robotTemplate.go();
        robotTemplate = new CookieRobot();
        robotTemplate.go();
    }

}
