package com.baeldung.decorator; //i commented on "armour.java" as each of these decorator files are essentially the same

public class Battleaxe extends GoblinDecorator {

    public Battleaxe(Goblin goblin) {
        super(goblin);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithBattleaxe();
    }
    
    private String decorateWithBattleaxe() {
        return " with Battleaxe";
    }
}