package com.baeldung.decorator; //imports package from github (used in example code)

public class Armour extends GoblinDecorator { //creates a public class Armour which is a child class (extension) of GoblinDecorator

    public Armour(Goblin goblin) { //creates a new public method called Armour using the Goblin class
        super(goblin); //used to access the parent class of goblin
    }
    
    public String decorate() { //creates a public method called decorate which has a string data type
        return super.decorate() + decorateWithArmour(); //returns the Goblin.decorate and adds armour to it
    }

    private String decorateWithArmour() { //creates a private method called decorateWithArmour which has a string data type
        return " with Armour"; //outputs " with Armour"
    }
}