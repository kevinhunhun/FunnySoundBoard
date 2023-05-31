package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //Buttons
    private Button btnFart;
    private Button btnRizz;

    private Button btnWetFart;

    private Button btnReverbFart;

    private Button btnLoudFart;

    private Button btnShortFart;

    private Button btnLongFart;

    private Button btnBassFart;

    private Button btnSuperLongfart;

    private Button btnBombFart;

    private Button btnTolietFart;

    private Button btnBeanFart;

    private RadioGroup radioGroupSongSelect;

    private MediaPlayer mpBackTrack;

    private MediaPlayer mpChoir;

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

        btnShortFart = findViewById(R.id.btn_short_fart);

        btnLongFart= findViewById(R.id.btn_long_fart);

        btnBassFart= findViewById(R.id.btn_bass_fart);

        btnSuperLongfart = findViewById(R.id.btn_super_long_fart);

        btnBombFart = findViewById(R.id.btn_bomb_fart);

        btnTolietFart = findViewById(R.id.btn_Toilet_fart);

        btnBeanFart = findViewById(R.id.btn_bean_fart);

        radioGroupSongSelect = findViewById(R.id.radiogroup_songselect);

        radioGroupSongSelect.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);

                if (radioButton.equals(findViewById(R.id.btnr_new_jersey_type_beat))) {
                    mpBackTrack = MediaPlayer.create(MainActivity.this,R.raw.sound_back_track);
                    mpBackTrack.start();
                    mpBackTrack.setLooping(true);

                }
                /*
                else if (option == 2) {
                    playBeanFart();
                }
                else if (option == 3) {
                    playBombFart();
                }
                */
                else if (radioButton.equals(findViewById(R.id.btnr_off))) {
                    mpBackTrack.stop();
                    mpBackTrack.setLooping(false);
                    mpBackTrack.release();
                    mpBackTrack = null;
                }


            }
        });

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

        btnShortFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playShortFart();

            }
        }));

        btnLongFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playLongFart();

            }
        }));

        btnBassFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playBassfart();

            }
        }));

        btnSuperLongfart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playsuperLongFart();

            }
        }));

        btnBombFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playBombFart();

            }
        }));

        btnTolietFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playTolietFart();

            }
        }));

        btnBeanFart.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {playBeanFart();

            }
        }));

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

    private void playShortFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_short_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playLongFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_long_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playBassfart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_bass_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playsuperLongFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_super_long_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playBombFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_bomb_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playTolietFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_toilet_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playBeanFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_bean_fart);
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






