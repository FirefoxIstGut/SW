package com.example.kroot.pianotiles;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by k.root on 03/08/2017.
 */

public class ScalePack{

    public Scale CIonian3;


    /*public static Scale[] getScalePack(){
        return new Scale[]{

        }
    }*/


    public ScalePack(Context context) {
        CIonian3 = new Scale(0,0,2);
        setCIonian3SoundPack(context);

        //TODO: some other predefined scales
    }

    public void setCIonian3SoundPack(Context context){
        //set 1st octave
        CIonian3.setFirstDegreeOctave1(MediaPlayer.create(context, R.raw.c3));
        CIonian3.setSecondDegreeOctave1(MediaPlayer.create(context, R.raw.d3));
        CIonian3.setThirdDegreeOctave1(MediaPlayer.create(context, R.raw.e3));
        CIonian3.setFourthDegreeOctave1(MediaPlayer.create(context, R.raw.f3));
        CIonian3.setFifthDegreeOctave1(MediaPlayer.create(context, R.raw.g3));
        CIonian3.setSixthDegreeOctave1(MediaPlayer.create(context, R.raw.a3));
        CIonian3.setSeventhDegreeOctave1(MediaPlayer.create(context, R.raw.b3));
        //set 2nd octave
        CIonian3.setFirstDegreeOctave2(MediaPlayer.create(context, R.raw.c4));
        CIonian3.setSecondDegreeOctave2(MediaPlayer.create(context, R.raw.d4));
        CIonian3.setThirdDegreeOctave2(MediaPlayer.create(context, R.raw.e4));
        CIonian3.setFourthDegreeOctave2(MediaPlayer.create(context, R.raw.f4));
        CIonian3.setFifthDegreeOctave2(MediaPlayer.create(context, R.raw.g4));
        CIonian3.setSixthDegreeOctave2(MediaPlayer.create(context, R.raw.a4));
        CIonian3.setSeventhDegreeOctave2(MediaPlayer.create(context, R.raw.b4));
        //set 3rd octave
        CIonian3.setFirstDegreeOctave3(MediaPlayer.create(context, R.raw.c5));
        CIonian3.setSecondDegreeOctave3(MediaPlayer.create(context, R.raw.d5));
        CIonian3.setThirdDegreeOctave3(MediaPlayer.create(context, R.raw.e5));
        CIonian3.setFourthDegreeOctave3(MediaPlayer.create(context, R.raw.f5));
        CIonian3.setFifthDegreeOctave3(MediaPlayer.create(context, R.raw.g5));
        CIonian3.setSixthDegreeOctave3(MediaPlayer.create(context, R.raw.a5));
        CIonian3.setSeventhDegreeOctave3(MediaPlayer.create(context, R.raw.b5));
    }

}


















