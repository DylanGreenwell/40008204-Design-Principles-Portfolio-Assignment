package com.baeldung.decorator;

import static com.baeldung.util.LoggerUtil.LOG;

public class DecoratorPatternDriver { //creates a new public class called DecoratorPatternDriver

    public static void main(String[] args) { //creates the main for the program to run the decorator in
        // goblin with just a battleaxe
        Goblin goblin1 = new Battleaxe(new GoblinImpl()); //creates a new Goblin class with a battle axe
        LOG.info(goblin1.decorate()); //outputs the goblin with all of its "decorations"

        // goblin with two battleaxes and armour
        Goblin goblin2 = new Armour(new Battleaxe(new Battleaxe(new GoblinImpl()))); //creates a new Goblin class with armour and two battleaxes
        LOG.info(goblin2.decorate());

        // goblin with a battleaxe, helmet and armour
        Goblin goblin3 = new Armour(new Helmet(new Battleaxe(new GoblinImpl()))); //creates a new Goblin class with armour, a helmet and a battleaxe
        LOG.info(goblin3.decorate());

        // king goblin (goblin with a crown)
        Goblin goblin4 = new Crown(new GoblinImpl()); //creates a new Goblin class with a crown
        LOG.info(goblin4.decorate());

        // invalid test example with code trying to make a goblin with a battleaxe and a crown
        Goblin goblin5 = new GoblinImpl(new Battleaxe(new Crown())); //not structured correctly so it would not work
        LOG.info(goblin5.decorate); //would not work as the previous line is not structured correctly
    }

}