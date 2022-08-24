package model;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IHunt;

// implemented missing interfaces
public class Eagle implements IFly, IHunt, IAnimal {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

   // @Override
    public void hunt() {
        System.out.println("Eagle is hunting");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
