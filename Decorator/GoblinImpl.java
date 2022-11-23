package com.baeldung.decorator;

public class GoblinImpl implements Goblin { //creates public class called GoblinImpl which implements the main Goblin interface

    @Override //makes this class run its own version of this method which is already defined by a super class
    public String decorate() { //creates public method called decorate with a string data value
        return "Goblin"; //outputs "Goblin"
    }

}