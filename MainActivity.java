package com.example.kroot.pianotiles;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Scale currentScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCurrentScale();
    }

    public void getCurrentScale(){
        /*Intent intent = getIntent();
        currentScale = intent.getSerializableExtra("currentScale");*/
        ScalePack scalePack = new ScalePack(this);
        currentScale = scalePack.CIonian3;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        final int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
        final int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
        float x = event.getX();
        float y = event.getY();
        Log.e("DEBUGGER", "onTouchEvent: " + x + " " + y);

        //X denotes the note played
        //Y denotes the octave of the note played
        //thus; first decide on X, then proceed w/ Y.

        if(x <= screenWidth/currentScale.getScaleSpan()){ //user pressed the first note in scale
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getFirstDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFirstDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFirstDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFirstDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFirstDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else if(x <= 2*screenWidth/currentScale.getScaleSpan()){ //user pressed the second note in scale
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getSecondDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSecondDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSecondDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSecondDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSecondDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else if(x <= 3*screenWidth/currentScale.getScaleSpan()){ //user pressed the third note in scale
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getThirdDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getThirdDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getThirdDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getThirdDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getThirdDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else if(x <= 4*screenWidth/currentScale.getScaleSpan()){ //user pressed the fourth note in scale
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getFourthDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFourthDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFourthDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFourthDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFourthDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else if(x <= 5*screenWidth/currentScale.getScaleSpan()){ //user pressed the fifth note in scale
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getFifthDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFifthDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFifthDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFifthDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getFifthDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else if(x <= 6*screenWidth/currentScale.getScaleSpan()){ //user pressed the sixth note in scale (not present in pentatonic)
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getSixthDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSixthDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSixthDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSixthDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSixthDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else if(x <= 7*screenWidth/currentScale.getScaleSpan()){ //user pressed the seventh note in scale (not present in pentatonic)
            if(y <= screenHeight/currentScale.getOctaveRange()){
                currentScale.getSeventhDegreeOctave1().start();
                
                
            }else if(y <= 2*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSeventhDegreeOctave2().start();
                
                
            }else if(y <= 3*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSeventhDegreeOctave3().start();
                
                
            }else if(y <= 4*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSeventhDegreeOctave4().start();
                
                
            }else if(y <= 5*screenHeight/currentScale.getOctaveRange()){
                currentScale.getSeventhDegreeOctave5().start();
                
                
            }else{
                Toast.makeText(this, "Coordinate Y of touch event not valid enough.", Toast.LENGTH_SHORT);
                
                
            }


        }else{
            Toast.makeText(this, "Coordinate X of touch event not valid enough.", Toast.LENGTH_SHORT);
            
            
        }
        return true;
    }
}
