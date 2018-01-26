package com.design.builder;

import com.design.template.RobotTemplate;

import java.util.ArrayList;
import java.util.List;

public class RobotBuilder{

    private List<Integer> stepList;
    private RobotTemplate robotTemplate;

    public RobotBuilder() {
        stepList = new ArrayList<>();
    }

    public RobotBuilder setStep(int i){
        stepList.add(i);
        return this;
    }

    public RobotBuilder build(RobotTemplate robotTemplate){
        this.robotTemplate = robotTemplate;
        return this;
    }

    public final void proceed(){
        for (Integer i:stepList){
            switch (i){
                case 1:
                    robotTemplate.start();
                break;
                case 2:
                    robotTemplate.getParts();
                break;
                case 3:
                    robotTemplate.assemble();
                break;
                case 4:
                    robotTemplate.test();
                break;
                case 5:
                    robotTemplate.stop();
                break;
                default:
                    System.out.println("not a valid option !!");
                break;
            }
        }
    }

}
