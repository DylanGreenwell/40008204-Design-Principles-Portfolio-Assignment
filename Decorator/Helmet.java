package com.baeldung.decorator; //i commented on "armour.java" as each of these decorator files are essentially the same

public class Helmet extends GoblinDecorator {

    public Helmet(Goblin goblin) {
        super(goblin);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithHelmet();
    }

    private String decorateWithHelmet() {
        return " with a Helmet";
    }
}