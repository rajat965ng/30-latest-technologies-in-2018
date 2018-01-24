package com.design.chainOfResponsibility;

public class LevelThreeHelp implements IHelp{



    @Override
    public void needHelp(int level) {
            System.out.println("Issue resolved at level 3");
    }


}
