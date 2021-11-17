package com.company;

//reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
//reference: Head First Design Patterns 2nd Ed.

//Concrete implementor...btns 3 and 4 are used differently
public class RCA extends TV {

    public RCA(int newChannel, int newMaxChannel, int newVolume, int newMaxVolume) {
        channel = newChannel;
        maxChannel = newMaxChannel;
        volume = newVolume;
        maxVolume = newMaxVolume;
    }

    //for the RCA TV, buttons 3 and 4 will turn the channels up and down
    @Override
    public void btnThreePressed() {
        channel ++;
        showChannel();
    }

    @Override
    public void btnFourPressed() {
        channel --;
        showChannel();
    }
}
