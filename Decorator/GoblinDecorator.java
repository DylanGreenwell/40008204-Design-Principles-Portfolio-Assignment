package com.baeldung.decorator; //imports necessary packages

public abstract class GoblinDecorator implements Goblin { //creates a public abstract class called GoblinDecorator which implements the Goblin interface
    private Goblin goblin; //creates a new instance of the Goblin interface
    
    public GoblinDecorator(Goblin goblin) { //public method called GoblinDecorator which takes in an input from the Goblin interface
        this.goblin = goblin; //assigns value of goblin to the .goblin of this class
    }
    
    //the code below is a standard constructor for the Goblin object

    @Override //overrides the parent class' method which is listed below
    public String decorate() { 
        return goblin.decorate(); //this creates a goblin which can be decorated
    }

}