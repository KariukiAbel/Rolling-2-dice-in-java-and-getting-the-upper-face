package com.nabesh;

import java.util.Random;

public class Dice {

    public int getFace(int totalNumberOfFaces){
        Random random = new Random();
        int face = 1 + random.nextInt(totalNumberOfFaces);
        return face;
    }

}
