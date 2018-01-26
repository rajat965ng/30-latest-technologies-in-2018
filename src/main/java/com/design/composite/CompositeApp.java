package com.design.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

    public static void main(String args[]){
        Corporate corporation = new Department("Corporation");

        Corporate research = new Department("R&D");
        List<Corporate> reasearchVps = new ArrayList<Corporate>(){{
            add(new VP("Steve"));add(new VP("Mike"));
            add(new VP("Nancy"));

        }};
        research.setCorporates(reasearchVps);


        Corporate sales = new Department("Sales");
        List<Corporate> salesVp = new ArrayList<Corporate>(){{
            add(new VP("Ted")); add(new VP("Bob"));
            add(new VP("Carol"));  add(new VP("Alice"));
        }};
        sales.setCorporates(salesVp);
        Corporate westernSales = new Department("Western Sales Division");
        List<Corporate> wsVp = new ArrayList<Corporate>(){{
            add(new VP("Wally")); add(new VP("Andre"));
        }};
        westernSales.setCorporates(wsVp);

        sales.setSubOrdinate(westernSales);


        Corporate vp = new VP("Carry");

        List<Corporate> topLevel = new ArrayList<>();
        topLevel.add(research);
        topLevel.add(sales);
        topLevel.add(vp);

        corporation.setCorporates(topLevel);

        corporation.display();

    }

}
