package com.design.chainOfResponsibility;

public class LevelOneHelp implements IHelp{

    private IHelp levelTwo;

    public LevelOneHelp(IHelp levelTwo) {
        this.levelTwo = levelTwo;
    }

    @Override
    public void needHelp(int level) {
        if (level==1){
            System.out.println("Issue resolved at level 1");
        }else {
            levelTwo.needHelp(level);
        }
    }
}
