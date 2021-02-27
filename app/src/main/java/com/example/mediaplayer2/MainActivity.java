package com.example.mediaplayer2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private ImageView artisImage;
    private TextView leftTime;
    private TextView rightTime;
    private SeekBar seekBar;
    private Button prevButton;
    private Button playButton;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUI();

        prevButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

    }

    public void setUpUI() {

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);
        artisImage = (ImageView) findViewById(R.id.imageView);
        leftTime = (TextView) findViewById(R.id.textLeft);
        rightTime = (TextView) findViewById(R.id.textRight);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        prevButton = (Button) findViewById(R.id.prevButton);
        playButton = (Button) findViewById(R.id.playButton);
        nextButton = (Button) findViewById(R.id.nextButton);

        prevButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.prevButton:
                //code
                break;
            case R.id.playButton:
                //code
                if (mediaPlayer.isPlaying()) {
                    pauseMusic();
                } else {
                    playMusic();
                }
                break;
            case R.id.nextButton:
                //code
                break;
        }
    }


    public void pauseMusic() {
        if (mediaPlayer != null) { //Jika mediaPlayer = Null maka mediaPlayer sedang dalam kondisi play music
            mediaPlayer.pause();//maka media play nya dipause
            //playButton.setBackgroundResource(android.R.drawable.ic_media_play);
            playButton.setText("Play"); //mengganti text pada tombol play menjadi "pause"
        }
    }

    public void playMusic() {
        if (mediaPlayer != null) { //Jika mediaPlayer = Null maka mediaPlayer sedang dalam kondisi play music
            mediaPlayer.pause();//maka media play nya dipause
            //playButton.setBackgroundResource(android.R.drawable.ic_media_play);
            playButton.setText("Pause"); //mengganti text pada tombol pause menjadi "play"
        }
    }

}
