package com.example.jaspreetsingh.musicplayer;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // MediaPlayer
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        // Find the button that play the media file
        Button play = (Button) findViewById(R.id.play_button);
        // Find the button that play the media file
         Button pause = (Button) findViewById(R.id.pause_button);



    // Set OnclickListener to the play button
    play.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View view){
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(MainActivity.this, "I am done", Toast.LENGTH_LONG).show();
            }
        });
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
