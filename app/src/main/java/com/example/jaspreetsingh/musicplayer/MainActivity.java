package com.example.jaspreetsingh.musicplayer;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Button to play the music
    public Button play;
    // Button to pause the music
    public Button pause;
    // MediaPlayer
    public MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button that play the media file
        play = (Button) findViewById(R.id.play_button);
        // Find the button that play the media file
        pause = (Button) findViewById(R.id.pause_button);

    mediaPlayer = MediaPlayer.create(this, R.raw.song);

    // Set OnclickListener to the play button
    play.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
        mediaPlayer.start();
    }
    });
    // Set onclickListener for the pause button
    pause.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view) {
            mediaPlayer.pause();
        }
    });
}
}
