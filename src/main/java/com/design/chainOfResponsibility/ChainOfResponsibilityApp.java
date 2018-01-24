package com.design.chainOfResponsibility;

public class ChainOfResponsibilityApp {

    public static void main(String args[]){
        IHelp levelThreeHelp = new LevelThreeHelp();
        IHelp levelTwoHelp = new LevelTwoHelp(levelThreeHelp);
        IHelp levelOneHelp = new LevelOneHelp(levelTwoHelp);

        levelOneHelp.needHelp(1);
        levelOneHelp.needHelp(3);
        levelOneHelp.needHelp(2);
    }

}
