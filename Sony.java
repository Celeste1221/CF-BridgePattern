package com.company;

//reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
//reference: Head First Design Patterns 2nd Ed.

public class Sony extends TV {

    public Sony(int newChannel, int newMaxChannel, int newVolume, int newMaxVolume) {
        channel = newChannel;
        maxChannel = newMaxChannel;
        volume = newVolume;
        maxVolume = newMaxVolume;
    }

    //opposite of RCA TV
    @Override
    public void btnThreePressed() {
        channel --;
        showChannel();
    }

    @Override
    public void btnFourPressed() {
        channel ++;
        showChannel();
    }
}
