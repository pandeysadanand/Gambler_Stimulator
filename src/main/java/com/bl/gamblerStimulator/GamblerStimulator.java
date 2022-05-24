package com.bl.gamblerStimulator;
/*
*@author : Sadanand Pandey
* welcome message
* Finding result of game
*  */
public class GamblerStimulator {

    public static final double INITIAL_STAKE = 100;
    public static final double STAKE_BET = 1;
    public static int stake = 0;

    public static void result() {
        boolean resign = false;
        while (resign == false){
            if (Math.random() < 0.5) {
            stake++;
            System.out.println("Win");
        } else {
            stake--;
            System.out.println("Lose");
        }
            if (stake >= INITIAL_STAKE + (INITIAL_STAKE * 0.5) || stake <= INITIAL_STAKE / 2) {
                resign = true;
                System.out.println(stake);
            }
        }
    }
    public static boolean calculation(){
        if ((int)Math.floor(Math.random()*10)%2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("---------♥-Welcome To Gambler Stimulator-♥---------");
        result();
    }
}
