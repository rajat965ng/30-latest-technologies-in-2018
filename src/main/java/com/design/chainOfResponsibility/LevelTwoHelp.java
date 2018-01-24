package com.design.chainOfResponsibility;

public class LevelTwoHelp implements IHelp {

    private IHelp levelThree;

    public LevelTwoHelp(IHelp levelThree) {
        this.levelThree = levelThree;
    }

    @Override
    public void needHelp(int level) {
        if (level==2){
            System.out.println("Issue resolved at level 2");
        }else {
            levelThree.needHelp(level);
        }
    }

}
