package com.company;
//reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
//reference: Head First Design Patterns 2nd Ed.

//this is the abstraction class hierarchy
//it Has-A TV object (implementation class), which is the bridge
public abstract class RemoteControl {

    //has a reference to the generic TV class (aggregation)
    private TV implementor; //needs to be in terms of the TV abstract class

    //constructor
    public RemoteControl(TV newImplementor) {
        this.implementor = newImplementor;
    }

    public void powerOnBtnPressed(){
        implementor.powerOnBtnPressed();
    }

    public void powerOffBtnPressed(){
        implementor.powerOffBtnPressed();
    }

    public void btnOnePressed(){
        implementor.btnOnePressed();
    }

    public void btnTwoPressed(){
        implementor.btnTwoPressed();
    }

    public void btnThreePressed(){
        implementor.btnThreePressed();
    }
    public void btnFourPressed(){
        implementor.btnFourPressed();
    }

    public abstract void btnFivePressed();
    public abstract void btnSixPressed();
}
