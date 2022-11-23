package com.baeldung.decorator; //i commented on "armour.java" as each of these decorator files are essentially the same

public class Crown extends GoblinDecorator {

    public Crown(Goblin goblin) {
        super(goblin);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithCrown();
    }
    
    private String decorateWithCrown() {
        return " with Crown";
    }
}