package com.company;

public class Main {
    public static void main(String[] args) {
        //reference: http://www.newthinktank.com/2012/10/bridge-design-pattern-tutorial/
        //reference: Head First Design Patterns 2nd Ed.

        //with remote 1
        RemoteControl rcaTV1 = new ConcreteRemote1(new RCA(1,42, 0, 15));
        RemoteControl sonyTV1 = new ConcreteRemote1(new Sony(1,42, 0, 20));

        //with remote 2
        RemoteControl rcaTV2 = new ConcreteRemote2(new RCA(1,50, 0, 10));
        RemoteControl sonyTV2 = new ConcreteRemote2(new Sony(1,50, 0 , 12));


        System.out.println("\nTest RCA TV with Remote Control 1:");

        rcaTV1.powerOnBtnPressed();
        rcaTV1.btnOnePressed(); //vol up
        rcaTV1.btnOnePressed(); //vol up
        rcaTV1.btnTwoPressed(); //vol down
        rcaTV1.btnThreePressed(); //channel up
        rcaTV1.btnFourPressed(); //channel down
        rcaTV1.btnFivePressed(); //mute
        rcaTV1.btnSixPressed(); //un-mute
        rcaTV1.powerOffBtnPressed();

        System.out.println("\nTest RCA TV with Remote Control 2:");

        rcaTV2.powerOnBtnPressed();
        rcaTV2.btnOnePressed(); //vol up
        rcaTV2.btnOnePressed(); //vol up
        rcaTV2.btnTwoPressed(); //vol down
        rcaTV2.btnThreePressed(); //channel up
        rcaTV2.btnFourPressed(); //channel down
        rcaTV2.btnFivePressed(); //pause
        rcaTV2.btnSixPressed(); //un-pause
        rcaTV2.powerOffBtnPressed();

        System.out.println("\nTest Sony TV with Remote Control 1:");

        sonyTV1.powerOnBtnPressed();
        sonyTV1.btnOnePressed(); //vol up
        sonyTV1.btnOnePressed(); //vol up
        sonyTV1.btnTwoPressed(); //vol down
        sonyTV1.btnThreePressed(); //channel down
        sonyTV1.btnFourPressed(); //channel up
        sonyTV1.btnFivePressed(); //mute
        sonyTV1.btnSixPressed(); //un-mute
        sonyTV1.powerOffBtnPressed();

        System.out.println("\nTest Sony TV with Remote Control 2:");

        sonyTV2.powerOnBtnPressed();
        sonyTV2.btnOnePressed(); //vol up
        sonyTV2.btnOnePressed(); //vol up
        sonyTV2.btnTwoPressed(); //vol down
        sonyTV2.btnThreePressed(); //channel down
        sonyTV2.btnFourPressed(); //channel up
        sonyTV2.btnFivePressed(); //pause
        sonyTV2.btnSixPressed(); //un-pause
        sonyTV2.powerOffBtnPressed();
    }
}
