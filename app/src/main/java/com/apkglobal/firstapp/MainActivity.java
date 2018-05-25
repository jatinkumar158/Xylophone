package com.apkglobal.firstapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button red,orange,darkblue,blue,darkgreen,green,pink;
    SoundPool soundPool=new SoundPool(7,AudioManager.STREAM_MUSIC,0);
    int a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // typecasting of xml widgets into java objects
        red=findViewById(R.id.red);
        orange=findViewById(R.id.orange);
        darkblue=findViewById(R.id.darkblue);
        blue=findViewById(R.id.blue);
        darkgreen=findViewById(R.id.darkgreen);
        green=findViewById(R.id.green);
        pink=findViewById(R.id.pink);

        // to play a sound we must have sound id of that sound
        // to get sound id we use load function
        // first parameter is application context:we use getApplicationContext for this
        // second one is sound file
        // third one is priority
        a=soundPool.load(getApplicationContext(),R.raw.sound1,1);
        b=soundPool.load(getApplicationContext(),R.raw.sound2,1);
        c=soundPool.load(getApplicationContext(),R.raw.sound3,1);
        d=soundPool.load(getApplicationContext(),R.raw.sound4,1);
        e=soundPool.load(getApplicationContext(),R.raw.sound5,1);
        f=soundPool.load(getApplicationContext(),R.raw.sound6,1);
        g=soundPool.load(getApplicationContext(),R.raw.sound7,1);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // to play a sound we use play function
                // c is the sound id
                soundPool.play(a,1.0f,1.0f,0,0,1.0f);
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(b,1.0f,1.0f,0,0,1.0f);
            }
        });

        darkblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(c,1.0f,1.0f,0,0,1.0f);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(d,1.0f,1.0f,0,0,1.0f);
            }
        });

        darkgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(e,1.0f,1.0f,0,0,1.0f);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(f,1.0f,1.0f,0,0,1.0f);
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(g,1.0f,1.0f,0,0,1.0f);
            }
        });

    }
}
