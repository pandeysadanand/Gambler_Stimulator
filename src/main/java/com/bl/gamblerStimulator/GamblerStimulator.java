package com.bl.gamblerStimulator;
/*
*@author : Sadanand Pandey
* welcome message
* Finding result of game
*  */
public class GamblerStimulator {

    public static final double INITIAL_STAKE = 100;
    public static final double STAKE_BET = 100;
    public static int stake = 0;

    public static void result() {
        if (Math.random() < 0.5) {
            stake++;
            System.out.println("Win");
        } else {
            stake--;
            System.out.println("Lose");
        }
    }
    public static void main(String[] args) {
        System.out.println("---------♥-Welcome To Gambler Stimulator-♥---------");
        result();
    }
}
