package com.company;
//reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
//reference: Head First Design Patterns 2nd Ed.

//concrete Subclasses are implemented in terms of the Abstraction
public class ConcreteRemote2 extends RemoteControl{
    public ConcreteRemote2(TV newImplementor) {
        super(newImplementor);
    }

    @Override
    public void btnFivePressed() {
        System.out.println("paused");
    }

    @Override
    public void btnSixPressed() {
        System.out.println("un-paused");
    }
}
