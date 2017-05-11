package my.app.pokemontypecoverage;

/**
 * Created by ams3141 on 4/27/2017.
 */

public class Totals extends Coverage {
    public static float tots2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static float tots[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public static int resistances[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static int weaknesses[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public static int immunes[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
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
    public static void reset_tots() {
        for (int i = 0; i < tots.length; i++) {
            tots[i] = 1;
        }
    }
    public static void reset_tots2() {
        for (int i = 0; i < tots2.length; i++) {
            tots2[i] = 0;
        }
    }
    public static void reset_resistances() {
        for (int i = 0; i < resistances.length; i++) {
            resistances[i] = 0;
        }
    }
    public static void reset_weaknesses() {
        for (int i = 0; i < weaknesses.length; i++) {
            weaknesses[i] = 0;
        }
    }
    public static void reset_immunes() {
        for (int i = 0; i < immunes.length; i++) {
            immunes[i] = 0;
        }
    }
    public static void sum() {
        for (int i = 0; i < tots2.length; i++) {
            tots2[i] += tots[i];
        }
    }
    public static void Normal(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 2;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 0;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
        //weaknesses[6] += 1;
        //immunes[13] += 1;

    }

    public static void Fire(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= 2;
        tots[3] *= 1;
        tots[4] *= .5;
        tots[5] *= .5;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 2;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= .5;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= .5;
        //resistances[1] += 1;
        //weaknesses[2] += 1;
        //resistances[4] += 1;
        //resistances[5] += 1;
        //weaknesses[8] += 1;
        //resistances[11] += 1;
        //weaknesses[12] += 1;
        //resistances[16] += 1;
        //resistances[17] += 1;

    }
    public static void Water(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= .5;
        tots[3] *= 2;
        tots[4] *= 2;
        tots[5] *= .5;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
        //resistances[1] += 1;
        //resistances[2] += 1;
        //weaknesses[3] += 1;
        //weaknesses[4] += 1;
        //resistances[5] += 1;
        //resistances[16] += 1;

    }
    public static void Electric(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= .5;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 2;
        tots[9] *= .5;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
        //resistances[3] += 1;
        //weaknesses[8] += 1;
        //resistances[9] += 1;
        //resistances[16] += 1;

    }
    public static void Grass(){
        tots[0] *= 1;
        tots[1] *= 2;
        tots[2] *= .5;
        tots[3] *= .5;
        tots[4] *= .5;
        tots[5] *= 2;
        tots[6] *= 1;
        tots[7] *= 2;
        tots[8] *= .5;
        tots[9] *= 2;
        tots[10] *= 1;
        tots[11] *= 2;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
        //weaknesses[1] += 1;
        //resistances[2] += 1;
        //resistances[3] += 1;
        //resistances[4] += 1;
        //weaknesses[5] += 1;
        //weaknesses[7] += 1;
        //resistances[8] += 1;
        //weaknesses[9] += 1;
        //weaknesses[11] += 1;

    }
    public static void Ice(){
        tots[0] *= 1;
        tots[1] *= 2;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= .5;
        tots[6] *= 2;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 2;
        tots[17] *= 1;
        //weaknesses[1] += 1;
        //resistances[5] += 1;
        //weaknesses[6] += 1;
        //weaknesses[12] += 1;
        //weaknesses[16] += 1;

    }
    public static void Fighting(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 2;
        tots[10] *= 2;
        tots[11] *= .5;
        tots[12] *= .5;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= .5;
        tots[16] *= 1;
        tots[17] *= 2;
        //weaknesses[9] += 1;
        //weaknesses[10] += 1;
        //resistances[11] += 1;
        //resistances[12] += 1;
        //resistances[15] += 1;
        //weaknesses[17] += 1;

    }
    public static void Poison(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= .5;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= .5;
        tots[8] *= 2;
        tots[9] *= 1;
        tots[10] *= 2;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= .5;
        //resistances[4] += 1;
        //resistances[7] += 1;
        //weaknesses[8] += 1;
        //weaknesses[10] += 1;
        //resistances[17] += 1;

    }
    public static void Ground(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 2;
        tots[3] *= 0;
        tots[4] *= 2;
        tots[5] *= 2;
        tots[6] *= 1;
        tots[7] *= .5;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= .5;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
        //weaknesses[2] += 1;
        //immunes[3] += 1;
        //weaknesses[4] += 1;
        //weaknesses[5] += 1;
        //resistances[7] += 1;
        //resistances[12] += 1;

    }
    public static void Flying(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 2;
        tots[4] *= .5;
        tots[5] *= 2;
        tots[6] *= .5;
        tots[7] *= 1;
        tots[8] *= 0;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
        //weaknesses[3] += 1;
        //resistances[4] += 1;
        //weaknesses[5] += 1;
        //resistances[6] += 1;
        //immunes[8] += 1;
        //weaknesses[12] += 1;

    }
    public static void Psychic(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= .5;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= .5;
        tots[11] *= 2;
        tots[12] *= 1;
        tots[13] *= 2;
        tots[14] *= 1;
        tots[15] *= 2;
        tots[16] *= 1;
        tots[17] *= 1;
        //resistances[6] += 1;
        //resistances[10] += 1;
        //weaknesses[11] += 1;
        //weaknesses[13] += 1;
        //weaknesses[15] += 1;

    }
    public static void Bug(){
        tots[0] *= 1;
        tots[1] *= 2;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= .5;
        tots[5] *= 1;
        tots[6] *= .5;
        tots[7] *= 1;
        tots[8] *= .5;
        tots[9] *= 2;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
        //weaknesses[1] += 1;
        //resistances[4] += 1;
        //resistances[6] += 1;
        //resistances[8] += 1;
        //weaknesses[9] += 1;
        //weaknesses[12] += 1;

    }
    public static void Rock(){
        tots[0] *= .5;
        tots[1] *= .5;
        tots[2] *= 2;
        tots[3] *= 1;
        tots[4] *= 2;
        tots[5] *= 1;
        tots[6] *= 2;
        tots[7] *= .5;
        tots[8] *= 2;
        tots[9] *= .5;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 2;
        tots[17] *= 1;
        //resistances[0] += 1;
        //resistances[1] += 1;
        //weaknesses[2] += 1;
        //weaknesses[4] += 1;
        //weaknesses[6] += 1;
        //resistances[7] += 1;
        //weaknesses[8] += 1;
        //resistances[9] += 1;
        //weaknesses[16] += 1;

    }
    public static void Ghost(){
        tots[0] *= 0;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 0;
        tots[7] *= .5;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= .5;
        tots[12] *= 1;
        tots[13] *= 2;
        tots[14] *= 1;
        tots[15] *= 2;
        tots[16] *= 1;
        tots[17] *= 1;
        //immunes[0] += 1;
        //immunes[6] += 1;
        //resistances[7] += 1;
        //resistances[11] += 1;
        //weaknesses[13] += 1;
        //weaknesses[15] += 1;

    }
    public static void Dragon(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= .5;
        tots[3] *= .5;
        tots[4] *= .5;
        tots[5] *= 2;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 2;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 2;
        //resistances[1] += 1;
        //resistances[2] += 1;
        //resistances[3] += 1;
        //resistances[4] += 1;
        //weaknesses[5] += 1;
        //weaknesses[14] += 1;
        //weaknesses[17] += 1;

    }
    public static void Dark(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 2;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 0;
        tots[11] *= 2;
        tots[12] *= 1;
        tots[13] *= .5;
        tots[14] *= 1;
        tots[15] *= .5;
        tots[16] *= 1;
        tots[17] *= 2;
        //weaknesses[6] += 1;
        //immunes[10] += 1;
        //weaknesses[11] += 1;
        //resistances[13] += 1;
        //resistances[15] += 1;
        //weaknesses[17] += 1;

    }
    public static void Steel(){
        tots[0] *= .5;
        tots[1] *= 2;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= .5;
        tots[5] *= .5;
        tots[6] *= 2;
        tots[7] *= 0;
        tots[8] *= 2;
        tots[9] *= .5;
        tots[10] *= .5;
        tots[11] *= 1;
        tots[12] *= .5;
        tots[13] *= 1;
        tots[14] *= .5;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= .5;
        //resistances[0] += 1;
        //weaknesses[1] += 1;
        //resistances[4] += 1;
        //resistances[5] += 1;
        //weaknesses[6] += 1;
        //immunes[7] += 1;
        //weaknesses[8] += 1;
        //resistances[9] += 1;
        //resistances[10] += 1;
        //resistances[12] += 1;
        //resistances[14] += 1;
        //resistances[17] += 1;

    }
    public static void Fairy(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= .5;
        tots[7] *= 2;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= .5;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 0;
        tots[15] *= .5;
        tots[16] *= 2;
        tots[17] *= 1;
        //resistances[6] += 1;
        //weaknesses[7] += 1;
        //resistances[11] += 1;
        //immunes[14] += 1;
        //resistances[15] += 1;
        //weaknesses[16] += 1;

    }
    public static void NormalAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= .5;
        tots[13] *= 0;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
    }
    public static void FireAttack(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= .5;
        tots[3] *= 1;
        tots[4] *= 2;
        tots[5] *= 2;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= .5;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 2;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= .5;
        tots[15] *= 1;
        tots[16] *= 2;
        tots[17] *= 1;
    }
    public static void WaterAttack(){
        tots[0] *= 1;
        tots[1] *= 2;
        tots[2] *= .5;
        tots[3] *= 1;
        tots[4] *= .5;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 2;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= .5;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
    }
    public static void ElectricAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 2;
        tots[3] *= .5;
        tots[4] *= .5;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 0;
        tots[9] *= 2;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= .5;
        tots[15] *= 1;
        tots[16] *= 1;
        tots[17] *= 1;
    }
    public static void GrassAttack(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= 2;
        tots[3] *= 1;
        tots[4] *= .5;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= .5;
        tots[8] *= 2;
        tots[9] *= .5;
        tots[10] *= 1;
        tots[11] *= .5;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= .5;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
    }
    public static void IceAttack(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= .5;
        tots[3] *= 1;
        tots[4] *= 2;
        tots[5] *= .5;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 2;
        tots[9] *= 2;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 2;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
    }
    public static void FightingAttack(){
        tots[0] *= 2;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 2;
        tots[6] *= 1;
        tots[7] *= .5;
        tots[8] *= 1;
        tots[9] *= .5;
        tots[10] *= .5;
        tots[11] *= .5;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 2;
        tots[16] *= 2;
        tots[17] *= .5;
    }
    public static void PoisonAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 2;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= .5;
        tots[8] *= .5;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= .5;
        tots[13] *= .5;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 0;
        tots[17] *= 2;
    }
    public static void GroundAttack(){
        tots[0] *= 1;
        tots[1] *= 2;
        tots[2] *= 1;
        tots[3] *= 2;
        tots[4] *= .5;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 2;
        tots[8] *= 1;
        tots[9] *= 0;
        tots[10] *= 1;
        tots[11] *= .5;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= 2;
        tots[17] *= 1;
    }
    public static void FlyingAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= .5;
        tots[4] *= 2;
        tots[5] *= 1;
        tots[6] *= 2;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 2;
        tots[12] *= .5;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
    }
    public static void PsychicAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 2;
        tots[7] *= 2;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= .5;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 0;
        tots[16] *= .5;
        tots[17] *= 1;
    }
    public static void BugAttack(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 2;
        tots[5] *= 1;
        tots[6] *= .5;
        tots[7] *= .5;
        tots[8] *= 1;
        tots[9] *= .5;
        tots[10] *= 2;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= .5;
        tots[14] *= 1;
        tots[15] *= 2;
        tots[16] *= .5;
        tots[17] *= .5;
    }
    public static void RockAttack(){
        tots[0] *= 1;
        tots[1] *= 2;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 2;
        tots[6] *= .5;
        tots[7] *= 1;
        tots[8] *= .5;
        tots[9] *= 2;
        tots[10] *= 1;
        tots[11] *= 2;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 1;
    }
    public static void GhostAttack(){
        tots[0] *= 0;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 2;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 2;
        tots[14] *= 1;
        tots[15] *= .5;
        tots[16] *= 1;
        tots[17] *= 1;
    }
    public static void DragonAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 2;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 0;
    }
    public static void DarkAttack(){
        tots[0] *= 1;
        tots[1] *= 1;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= .5;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 2;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 2;
        tots[14] *= 1;
        tots[15] *= .5;
        tots[16] *= 1;
        tots[17] *= .5;
    }
    public static void SteelAttack(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= .5;
        tots[3] *= .5;
        tots[4] *= 1;
        tots[5] *= 2;
        tots[6] *= 1;
        tots[7] *= 1;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 2;
        tots[13] *= 1;
        tots[14] *= 1;
        tots[15] *= 1;
        tots[16] *= .5;
        tots[17] *= 2;
    }
    public static void FairyAttack(){
        tots[0] *= 1;
        tots[1] *= .5;
        tots[2] *= 1;
        tots[3] *= 1;
        tots[4] *= 1;
        tots[5] *= 1;
        tots[6] *= 2;
        tots[7] *= .5;
        tots[8] *= 1;
        tots[9] *= 1;
        tots[10] *= 1;
        tots[11] *= 1;
        tots[12] *= 1;
        tots[13] *= 1;
        tots[14] *= 2;
        tots[15] *= 2;
        tots[16] *= .5;
        tots[17] *= 1;
    }



}
