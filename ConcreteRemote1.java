package com.company;
//reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
//reference: Head First Design Patterns 2nd Ed.

//concrete Subclasses are implemented in terms of the Abstraction
public class ConcreteRemote1  extends RemoteControl{

    public ConcreteRemote1(TV newImplementor) {
        super(newImplementor);
    }

    @Override
    public void btnFivePressed() {
        System.out.println("muted");
    }

    @Override
    public void btnSixPressed() {
        System.out.println("un-muted");
    }
}
