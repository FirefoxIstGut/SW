package com.example.kroot.pianotiles;

import android.media.MediaPlayer;
import java.io.Serializable;

/**
 * Created by k.root on 02/08/2017.
 */

public class Scale implements Serializable {

    private int key; //(C1 to B1 as 0 to 11)
    private int scaleType; //Ionian to Locrian as 0 to 6, Pentatonic Minor as 7, Pentatonic major as 8.
    private int scaleSpan; //Ionian to Locrian contain 7 notes, Pentatonic Minor 5, Pentatonic Major 5.
    private int octaveRange; //3, 4, 5

    public Scale(int key, int scaleType, int octaveRange){
        this.key = key;
        this.scaleType = scaleType;
        this.octaveRange = octaveRange;
        switch(scaleType){
            case(0):
            case(1):
            case(2):
            case(3):
            case(4):
            case(5):
            case(6): this.scaleSpan = 7; break;
            case(7):
            case(8): this.scaleSpan = 5; break;
            default:
        }
    }

    //-degrees for OCT1
    private MediaPlayer firstDegreeOctave1;
    private MediaPlayer secondDegreeOctave1;
    private MediaPlayer thirdDegreeOctave1;
    private MediaPlayer fourthDegreeOctave1;
    private MediaPlayer fifthDegreeOctave1;
    private MediaPlayer sixthDegreeOctave1; //= null for pentatonic
    private MediaPlayer seventhDegreeOctave1; //= null for pentatonic
    //-degrees for OCT2
    private MediaPlayer firstDegreeOctave2;
    private MediaPlayer secondDegreeOctave2;
    private MediaPlayer thirdDegreeOctave2;
    private MediaPlayer fourthDegreeOctave2;
    private MediaPlayer fifthDegreeOctave2;
    private MediaPlayer sixthDegreeOctave2; //= null for pentatonic
    private MediaPlayer seventhDegreeOctave2; //= null for pentatonic
    //-degrees for OCT3
    private MediaPlayer firstDegreeOctave3;
    private MediaPlayer secondDegreeOctave3;
    private MediaPlayer thirdDegreeOctave3;
    private MediaPlayer fourthDegreeOctave3;
    private MediaPlayer fifthDegreeOctave3;
    private MediaPlayer sixthDegreeOctave3; //= null for pentatonic
    private MediaPlayer seventhDegreeOctave3; //= null for pentatonic
    //-degrees for OCT4
    private MediaPlayer firstDegreeOctave4;
    private MediaPlayer secondDegreeOctave4;
    private MediaPlayer thirdDegreeOctave4;
    private MediaPlayer fourthDegreeOctave4;
    private MediaPlayer fifthDegreeOctave4;
    private MediaPlayer sixthDegreeOctave4; //= null for pentatonic
    private MediaPlayer seventhDegreeOctave4; //= null for pentatonic
    //-degrees for OCT5
    private MediaPlayer firstDegreeOctave5;
    private MediaPlayer secondDegreeOctave5;
    private MediaPlayer thirdDegreeOctave5;
    private MediaPlayer fourthDegreeOctave5;
    private MediaPlayer fifthDegreeOctave5;
    private MediaPlayer sixthDegreeOctave5; //= null for pentatonic
    private MediaPlayer seventhDegreeOctave5; //= null for pentatonic

    public String toString(){
        String key;
        String scaleType;
        String scaleSpan;
        String octaveRange;
        String description;

        switch(this.key){
            case(0): key = "C"; break;
            case(1): key = "C#"; break;
            case(2): key = "D"; break;
            case(3): key = "D#"; break;
            case(4): key = "E"; break;
            case(5): key = "F"; break;
            case(6): key = "F#"; break;
            case(7): key = "G"; break;
            case(8): key = "G#"; break;
            case(9): key = "A"; break;
            case(10): key = "A#"; break;
            case(11): key = "B"; break;
            default: key = null;
        }

        switch(this.scaleType){
            case(0): scaleType = "Ionian"; break;
            case(1): scaleType = "Dorian"; break;
            case(2): scaleType = "Phrygian"; break;
            case(3): scaleType = "Lydian"; break;
            case(4): scaleType = "Mixolydian"; break;
            case(5): scaleType = "Aeolian"; break;
            case(6): scaleType = "Locrian"; break;
            case(7): scaleType = "Pentatonic Minor"; break;
            case(8): scaleType = "Pentatonic Major"; break;
            default: scaleType = null;
        }

        scaleSpan = String.valueOf(this.scaleSpan);
        octaveRange = String.valueOf(this.octaveRange);

        description = key + " " + scaleType + " containing " + scaleSpan + " notes, ranging over" + octaveRange + " octaves.";
        return description;
    }

    public int getKey(){
        return this.key;
    }

    public int getScaleType(){
        return this.scaleType;
    }

    public int getScaleSpan(){
        return this.scaleSpan;
    }

    public int getOctaveRange(){
        return this.octaveRange;
    }

    //Activity will use the following methods to reach the MediaPlayer which produce the sounds.

    //GETTERS AND SETTERS FOR EACH POSSIBLE DEGREE(7)*OCTAVE(5) = 35
    public MediaPlayer getFirstDegreeOctave1() {
        return firstDegreeOctave1;
    }
    public MediaPlayer getSecondDegreeOctave1() {
        return secondDegreeOctave1;
    }
    public MediaPlayer getThirdDegreeOctave1() {
        return thirdDegreeOctave1;
    }
    public MediaPlayer getFourthDegreeOctave1() {
        return fourthDegreeOctave1;
    }
    public MediaPlayer getFifthDegreeOctave1() {
        return fifthDegreeOctave1;
    }
    public MediaPlayer getSixthDegreeOctave1() {
        return sixthDegreeOctave1;
    }
    public MediaPlayer getSeventhDegreeOctave1() {
        return seventhDegreeOctave1;
    }
    public MediaPlayer getFirstDegreeOctave2() {
        return firstDegreeOctave2;
    }
    public MediaPlayer getSecondDegreeOctave2() {
        return secondDegreeOctave2;
    }
    public MediaPlayer getThirdDegreeOctave2() {
        return thirdDegreeOctave2;
    }
    public MediaPlayer getFourthDegreeOctave2() {
        return fourthDegreeOctave2;
    }
    public MediaPlayer getFifthDegreeOctave2() {
        return fifthDegreeOctave2;
    }
    public MediaPlayer getSixthDegreeOctave2() {
        return sixthDegreeOctave2;
    }
    public MediaPlayer getSeventhDegreeOctave2() {
        return seventhDegreeOctave2;
    }
    public MediaPlayer getFirstDegreeOctave3() {
        return firstDegreeOctave3;
    }
    public MediaPlayer getSecondDegreeOctave3() {
        return secondDegreeOctave3;
    }
    public MediaPlayer getThirdDegreeOctave3() {
        return thirdDegreeOctave3;
    }
    public MediaPlayer getFourthDegreeOctave3() {
        return fourthDegreeOctave3;
    }
    public MediaPlayer getFifthDegreeOctave3() {
        return fifthDegreeOctave3;
    }
    public MediaPlayer getSixthDegreeOctave3() {
        return sixthDegreeOctave3;
    }
    public MediaPlayer getSeventhDegreeOctave3() {
        return seventhDegreeOctave3;
    }
    public MediaPlayer getFirstDegreeOctave4() {
        return firstDegreeOctave4;
    }
    public MediaPlayer getSecondDegreeOctave4() {
        return secondDegreeOctave4;
    }
    public MediaPlayer getThirdDegreeOctave4() {
        return thirdDegreeOctave4;
    }
    public MediaPlayer getFourthDegreeOctave4() {
        return fourthDegreeOctave4;
    }
    public MediaPlayer getFifthDegreeOctave4() {
        return fifthDegreeOctave4;
    }
    public MediaPlayer getSixthDegreeOctave4() {
        return sixthDegreeOctave4;
    }
    public MediaPlayer getSeventhDegreeOctave4() {
        return seventhDegreeOctave4;
    }
    public MediaPlayer getFirstDegreeOctave5() {
        return firstDegreeOctave5;
    }
    public MediaPlayer getSecondDegreeOctave5() {
        return secondDegreeOctave5;
    }
    public MediaPlayer getThirdDegreeOctave5() {
        return thirdDegreeOctave5;
    }
    public MediaPlayer getFourthDegreeOctave5() {
        return fourthDegreeOctave5;
    }
    public MediaPlayer getFifthDegreeOctave5() {
        return fifthDegreeOctave5;
    }
    public MediaPlayer getSixthDegreeOctave5() {
        return sixthDegreeOctave5;
    }
    public MediaPlayer getSeventhDegreeOctave5() {
        return seventhDegreeOctave5;
    }

    public void setFirstDegreeOctave1(MediaPlayer firstDegreeOctave1) {
        this.firstDegreeOctave1 = firstDegreeOctave1;
    }
    public void setSecondDegreeOctave1(MediaPlayer secondDegreeOctave1) {
        this.secondDegreeOctave1 = secondDegreeOctave1;
    }
    public void setThirdDegreeOctave1(MediaPlayer thirdDegreeOctave1) {
        this.thirdDegreeOctave1 = thirdDegreeOctave1;
    }
    public void setFourthDegreeOctave1(MediaPlayer fourthDegreeOctave1) {
        this.fourthDegreeOctave1 = fourthDegreeOctave1;
    }
    public void setFifthDegreeOctave1(MediaPlayer fifthDegreeOctave1) {
        this.fifthDegreeOctave1 = fifthDegreeOctave1;
    }
    public void setSixthDegreeOctave1(MediaPlayer sixthDegreeOctave1) {
        this.sixthDegreeOctave1 = sixthDegreeOctave1;
    }
    public void setSeventhDegreeOctave1(MediaPlayer seventhDegreeOctave1) {
        this.seventhDegreeOctave1 = seventhDegreeOctave1;
    }
    public void setFirstDegreeOctave2(MediaPlayer firstDegreeOctave2) {
        this.firstDegreeOctave2 = firstDegreeOctave2;
    }
    public void setSecondDegreeOctave2(MediaPlayer secondDegreeOctave2) {
        this.secondDegreeOctave2 = secondDegreeOctave2;
    }
    public void setThirdDegreeOctave2(MediaPlayer thirdDegreeOctave2) {
        this.thirdDegreeOctave2 = thirdDegreeOctave2;
    }
    public void setFourthDegreeOctave2(MediaPlayer fourthDegreeOctave2) {
        this.fourthDegreeOctave2 = fourthDegreeOctave2;
    }
    public void setFifthDegreeOctave2(MediaPlayer fifthDegreeOctave2) {
        this.fifthDegreeOctave2 = fifthDegreeOctave2;
    }
    public void setSixthDegreeOctave2(MediaPlayer sixthDegreeOctave2) {
        this.sixthDegreeOctave2 = sixthDegreeOctave2;
    }
    public void setSeventhDegreeOctave2(MediaPlayer seventhDegreeOctave2) {
        this.seventhDegreeOctave2 = seventhDegreeOctave2;
    }
    public void setFirstDegreeOctave3(MediaPlayer firstDegreeOctave3) {
        this.firstDegreeOctave3 = firstDegreeOctave3;
    }
    public void setSecondDegreeOctave3(MediaPlayer secondDegreeOctave3) {
        this.secondDegreeOctave3 = secondDegreeOctave3;
    }
    public void setThirdDegreeOctave3(MediaPlayer thirdDegreeOctave3) {
        this.thirdDegreeOctave3 = thirdDegreeOctave3;
    }
    public void setFourthDegreeOctave3(MediaPlayer fourthDegreeOctave3) {
        this.fourthDegreeOctave3 = fourthDegreeOctave3;
    }
    public void setFifthDegreeOctave3(MediaPlayer fifthDegreeOctave3) {
        this.fifthDegreeOctave3 = fifthDegreeOctave3;
    }
    public void setSixthDegreeOctave3(MediaPlayer sixthDegreeOctave3) {
        this.sixthDegreeOctave3 = sixthDegreeOctave3;
    }
    public void setSeventhDegreeOctave3(MediaPlayer seventhDegreeOctave3) {
        this.seventhDegreeOctave3 = seventhDegreeOctave3;
    }
    public void setFirstDegreeOctave4(MediaPlayer firstDegreeOctave4) {
        this.firstDegreeOctave4 = firstDegreeOctave4;
    }
    public void setSecondDegreeOctave4(MediaPlayer secondDegreeOctave4) {
        this.secondDegreeOctave4 = secondDegreeOctave4;
    }
    public void setThirdDegreeOctave4(MediaPlayer thirdDegreeOctave4) {
        this.thirdDegreeOctave4 = thirdDegreeOctave4;
    }
    public void setFourthDegreeOctave4(MediaPlayer fourthDegreeOctave4) {
        this.fourthDegreeOctave4 = fourthDegreeOctave4;
    }
    public void setFifthDegreeOctave4(MediaPlayer fifthDegreeOctave4) {
        this.fifthDegreeOctave4 = fifthDegreeOctave4;
    }
    public void setSixthDegreeOctave4(MediaPlayer sixthDegreeOctave4) {
        this.sixthDegreeOctave4 = sixthDegreeOctave4;
    }
    public void setSeventhDegreeOctave4(MediaPlayer seventhDegreeOctave4) {
        this.seventhDegreeOctave4 = seventhDegreeOctave4;
    }
    public void setFirstDegreeOctave5(MediaPlayer firstDegreeOctave5) {
        this.firstDegreeOctave5 = firstDegreeOctave5;
    }
    public void setSecondDegreeOctave5(MediaPlayer secondDegreeOctave5) {
        this.secondDegreeOctave5 = secondDegreeOctave5;
    }
    public void setThirdDegreeOctave5(MediaPlayer thirdDegreeOctave5) {
        this.thirdDegreeOctave5 = thirdDegreeOctave5;
    }
    public void setFourthDegreeOctave5(MediaPlayer fourthDegreeOctave5) {
        this.fourthDegreeOctave5 = fourthDegreeOctave5;
    }
    public void setFifthDegreeOctave5(MediaPlayer fifthDegreeOctave5) {
        this.fifthDegreeOctave5 = fifthDegreeOctave5;
    }
    public void setSixthDegreeOctave5(MediaPlayer sixthDegreeOctave5) {
        this.sixthDegreeOctave5 = sixthDegreeOctave5;
    }
    public void setSeventhDegreeOctave5(MediaPlayer seventhDegreeOctave5) {
        this.seventhDegreeOctave5 = seventhDegreeOctave5;
    }
}
