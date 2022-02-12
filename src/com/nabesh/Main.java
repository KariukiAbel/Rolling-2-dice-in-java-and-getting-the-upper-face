package com.nabesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dice dice = new Dice();
        System.out.println("Top Face of die 1 is : " + dice.getFace(6));
        Dice dice2 = new Dice();
        System.out.println("Dice 2 top face is: " + dice2.getFace(6));
    }
}
