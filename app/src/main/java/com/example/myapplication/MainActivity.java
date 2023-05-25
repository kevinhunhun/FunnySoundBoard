package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    //Buttons
    private Button btnFart;
    private Button btnRizz;

    private Button btnWetFart;

    private Button btnReverbFart;

    private Button btnLoudFart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnFart = findViewById(R.id.btn_fart);

        btnRizz = findViewById(R.id.btn_rizz);

        btnWetFart = findViewById(R.id.btn_wet_fart);

        btnReverbFart = findViewById(R.id.btn_reverb_fart);

        btnLoudFart = findViewById(R.id.btn_loud_fart);

        btnFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFart();
            }
        });

        btnRizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playRizz();
            }
        });

        btnWetFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playWetFart();

            }
        });

        btnReverbFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) { playReverbFart();

            }
        }));

        btnLoudFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { playLoudFart();

            }
        });

    }

    private void playFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    //buttons
    private void playRizz(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_rizz);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playWetFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_wet_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playReverbFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_fart_reverb);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playLoudFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_loud_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    }






