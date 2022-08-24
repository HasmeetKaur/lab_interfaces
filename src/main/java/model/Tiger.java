package model;

import model.interfaces.*;

// Hint: missing an interface and a method implementation
// implemented missing interfaces

public class Tiger implements IAnimal, ISwim, IHunt, IRun {

    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    // added the IRun interface and added the run method

    @Override
    public void run() {

    }


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void hunt() {
        
    }
}
