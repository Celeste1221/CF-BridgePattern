package com.company;

//reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
//reference: Head First Design Patterns 2nd Ed.

//this is the Implementation class hierarchy i.e. Implementor
public abstract class TV {

    public int channel = 0;
    public int maxChannel = 0;
    public int volume = 0;
    public int maxVolume = 0;

    //different TV's will do different things with these buttons:
    public abstract void btnThreePressed();
    public abstract void btnFourPressed();

    //all TV's will do the same things with these buttons:
    public void powerOnBtnPressed(){
        System.out.println("TV on");
    }

    public void powerOffBtnPressed(){
        System.out.println("TV off");
    }

    //turn volume up
    public void btnOnePressed(){
        volume ++;
        showVolume();
    }

    //turn volume down
    public void btnTwoPressed(){
        volume --;
        showVolume();
    }

    //show channel between 1 and maxChannel
    public void showChannel(){
        if(channel > maxChannel || channel < 0){
            channel = 1;
        }
        System.out.println("Channel: " + channel);
    }

    //show volume level between 0 and maxVolume
    public void showVolume(){
        if(volume > maxVolume || volume < 0){
            volume = 0;
        }
        System.out.println("Volume: " + volume);
    }
}
