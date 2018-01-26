package com.design.builder;

import com.design.template.AutomotiveRobot;
import com.design.template.CookieRobot;
import com.design.template.RobotTemplate;

public class BuilderApp {

    public static void main(String args[]){
        RobotTemplate robotTemplate = new AutomotiveRobot();
        RobotBuilder builder = new RobotBuilder();
        builder = builder.setStep(2).setStep(1).setStep(4)
                .setStep(3).setStep(5).build(robotTemplate);
        builder.proceed();
        robotTemplate = new CookieRobot();
        builder.build(robotTemplate);
        builder.proceed();
    }

}
