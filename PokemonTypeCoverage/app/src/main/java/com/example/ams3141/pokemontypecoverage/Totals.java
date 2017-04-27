package com.example.ams3141.pokemontypecoverage;

/**
 * Created by ams3141 on 4/27/2017.
 */

public class Totals extends Coverage {
    public static float tots[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public static void setTot(int tot, int index) {
        tots[index] = tot;
    }
    public static float getTot (int index){
        return tots[index];
    }
    public static void Normal(){
        tots[0] += 0;
        tots[1] += 0;
        tots[2] += 0;
        tots[3] += 0;
        tots[4] += 0;
        tots[5] += 0;
        tots[6] += 0;
        tots[7] += 0;
        tots[8] += 0;
        tots[9] += 0;
        tots[10] += 0;
        tots[11] += 0;
        tots[12] += 0;
        tots[13] += 0;
        tots[14] += 0;
        tots[15] += 0;
        tots[16] += 0;
        tots[17] += 0;

    }
    public static void Fire(){
        tots[0] += 0;
        tots[1] += .5;
        tots[2] += 1;
        tots[3] += 0;
        tots[4] += .5;
        tots[5] += .5;
        tots[6] += 0;
        tots[7] += 0;
        tots[8] += 1;
        tots[9] += 0;
        tots[10] += 0;
        tots[11] += .5;
        tots[12] += 1;
        tots[13] += 0;
        tots[14] += 0;
        tots[15] += 0;
        tots[16] += .5;
        tots[17] += .5;

    }
    public static void Water(){
        tots[0] += 0;
        tots[1] += .5;
        tots[2] += .5;
        tots[3] += 2;
        tots[4] += 2;
        tots[5] += .5;
        tots[6] += 0;
        tots[7] += 0;
        tots[8] += 0;
        tots[9] += 0;
        tots[10] += 0;
        tots[11] += 0;
        tots[12] += 0;
        tots[13] += 0;
        tots[14] += 0;
        tots[15] += 0;
        tots[16] += .5;
        tots[17] += 0;

    }
    public static void Electric(){
        tots[0] += 0;
        tots[1] += 0;
        tots[2] += 0;
        tots[3] += .5;
        tots[4] += 0;
        tots[5] += 0;
        tots[6] += 0;
        tots[7] += 0;
        tots[8] += 2;
        tots[9] += .5;
        tots[10] += 0;
        tots[11] += 0;
        tots[12] += 0;
        tots[13] += 0;
        tots[14] += 0;
        tots[15] += 0;
        tots[16] += .5;
        tots[17] += 0;

    }
}
