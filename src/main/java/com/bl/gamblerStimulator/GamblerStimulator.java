package com.bl.gamblerStimulator;

/*
 *@author : Sadanand Pandey
 * welcome message
 * Finding result of game
 * resign stake on win
 * calculating total winning cost
 * total win and lost in a month
 *  */
public class GamblerStimulator {

    public static final double initialStake = 100;
    public static final double stakeBet = 1;
    public static int stake = 0, monthlyWin = 0, getMonthlyLoss = 0;
    public static final int numberOfPlays = 20;

    public static boolean calculation() {
        if ((int) Math.floor(Math.random() * 10) % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void result() {
        boolean resign = false;
        while (resign == false) {
            if (Math.random() < 0.5) {
                monthlyWin++;
                System.out.println("Win");
            } else {
                getMonthlyLoss++;
                System.out.println("Lose");
            }
            if (stake >= initialStake + (initialStake * 0.5) || stake <= initialStake / 2) {
                resign = true;
                System.out.println(stake);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("---------♥-Welcome To Gambler Stimulator-♥---------");
        int stake = 100;
        double balance = 0;
        for (int numberOfDays = 0; numberOfDays < numberOfPlays; numberOfDays++) {
            result();
            balance = balance + stake;
        }
        System.out.println("Total  amount : " + balance);
        double totalAmountWinAndLost = (initialStake * numberOfPlays) - balance;
        System.out.println("Number of days won : " + monthlyWin);
        System.out.println("Number of days loss : " + getMonthlyLoss);
        System.out.println("Total amount won and lost : " + totalAmountWinAndLost);
    }
}
