package com.example.ams3141.pokemontypecoverage;

/**
 * Created by ams3141 on 4/27/2017.
 */

public class TEST extends Coverage {
    public static float tots2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static float tots[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public static float resistances[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static float weaknesses[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static float immunes[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static int resistance = 0;
    public static int weakness = 0;
    public static int immune = 0;
    public static void setTot(int tot, int index) {
        tots[index] = tot;
    }
    public static float getTot (int index){
        return tots2[index];
    }
    public static void reset_res() {
        resistance = 0;
        weakness = 0;
        immune = 0;
    }
    public static void reset() {
        for (int i = 0; i < tots.length; i++) {
            tots[i] = 1;
        }
    }
    public static void reset2() {
        for (int i = 0; i < tots2.length; i++) {
            tots2[i] = 0;
        }
    }
    public static void sum() {
        for (int i = 0; i < tots2.length; i++) {
            tots2[i] += tots[i];
        }
    }
    public static void Normal(){
        weaknesses[6] += 1;
        immunes[13] += 1;
    }

    public static void Fire(){
        resistances[1] += 1;
        weaknesses[2] += 1;
        resistances[4] += 1;
        resistances[5] += 1;
        weaknesses[8] += 1;
        resistances[11] += 1;
        weaknesses[12] += 1;
        resistances[16] += 1;
        resistances[17] += 1;
    }
    public static void Water(){
        resistances[1] += 1;
        resistances[2] += 1;
        weaknesses[3] += 1;
        weaknesses[4] += 1;
        resistances[5] += 1;
        resistances[16] += 1;
    }
    public static void Electric(){
        resistances[3] += 1;
        weaknesses[8] += 1;
        resistances[9] += 1;
        resistances[16] += 1;
    }
    public static void Grass(){
        weaknesses[1] += 1;
        resistances[2] += 1;
        resistances[3] += 1;
        resistances[4] += 1;
        weaknesses[5] += 1;
        weaknesses[7] += 1;
        resistances[8] += 1;
        weaknesses[9] += 1;
        weaknesses[11] += 1;
    }
    public static void Ice(){
        weaknesses[1] += 1;
        resistances[5] += 1;
        weaknesses[6] += 1;
        weaknesses[12] += 1;
        weaknesses[16] += 1;
    }
    public static void Fighting(){
        weaknesses[9] += 1;
        weaknesses[10] += 1;
        resistances[11] += 1;
        resistances[12] += 1;
        resistances[15] += 1;
        weaknesses[17] += 1;
    }
    public static void Poison(){
        resistances[4] += 1;
        resistances[7] += 1;
        weaknesses[8] += 1;
        weaknesses[10] += 1;
        resistances[17] += 1;
    }
    public static void Ground(){
        weaknesses[2] += 1;
        immunes[3] += 1;
        weaknesses[4] += 1;
        weaknesses[5] += 1;
        resistances[7] += 1;
        resistances[12] += 1;
    }
    public static void Flying(){
        weaknesses[3] += 1;
        resistances[4] += 1;
        weaknesses[5] += 1;
        resistances[6] += 1;
        immunes[8] += 1;
        weaknesses[12] += 1;
    }
    public static void Psychic(){
        resistances[6] += 1;
        resistances[10] += 1;
        weaknesses[11] += 1;
        weaknesses[13] += 1;
        weaknesses[15] += 1;

    }
    public static void Bug(){
        weaknesses[1] += 1;
        resistances[4] += 1;
        resistances[6] += 1;
        resistances[8] += 1;
        weaknesses[9] += 1;
        weaknesses[12] += 1;

    }
    public static void Rock(){
        resistances[0] += 1;
        resistances[1] += 1;
        weaknesses[2] += 1;
        weaknesses[4] += 1;
        weaknesses[6] += 1;
        resistances[7] += 1;
        weaknesses[8] += 1;
        resistances[9] += 1;
        weaknesses[16] += 1;


    }
    public static void Ghost(){
        immunes[0] += 1;
        immunes[6] += 1;
        resistances[7] += 1;
        resistances[11] += 1;
        weaknesses[13] += 1;
        weaknesses[15] += 1;

    }
    public static void Dragon(){
        resistances[1] += 1;
        resistances[2] += 1;
        resistances[3] += 1;
        resistances[4] += 1;
        weaknesses[5] += 1;
        weaknesses[14] += 1;
        weaknesses[17] += 1;

    }
    public static void Dark(){
        weaknesses[6] += 1;
        immunes[10] += 1;
        weaknesses[11] += 1;
        resistances[13] += 1;
        resistances[15] += 1;
        weaknesses[17] += 1;

    }
    public static void Steel(){
        resistances[0] += 1;
        weaknesses[1] += 1;
        resistances[4] += 1;
        resistances[5] += 1;
        weaknesses[6] += 1;
        immunes[7] += 1;
        weaknesses[8] += 1;
        resistances[9] += 1;
        resistances[10] += 1;
        resistances[12] += 1;
        resistances[14] += 1;
        resistances[17] += 1;
    }
    public static void Fairy(){
        resistances[6] += 1;
        weaknesses[7] += 1;
        resistances[11] += 1;
        immunes[14] += 1;
        resistances[15] += 1;
        weaknesses[16] += 1;
    }

}
