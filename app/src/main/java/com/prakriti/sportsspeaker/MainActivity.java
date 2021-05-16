package com.prakriti.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton kickboxing, karate, judo, aikido, taekwondo, boxing;
        // each image is given a tag with same name as that of the sound attached to it
    // data type of tag is "Object"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kickboxing = findViewById(R.id.kickboxing);
        karate = findViewById(R.id.karate);
        judo = findViewById(R.id.judo);
        aikido = findViewById(R.id.aikido);
        taekwondo = findViewById(R.id.taekwondo);
        boxing = findViewById(R.id.boxing);

        boxing.setOnClickListener(this);
        kickboxing.setOnClickListener(this);
        judo.setOnClickListener(this);
        aikido.setOnClickListener(this);
        taekwondo.setOnClickListener(this);
        karate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.boxing:
                playSportSound(boxing.getTag().toString());
                break;

            case R.id.kickboxing:
                playSportSound(kickboxing.getTag().toString());
                break;

            case R.id.judo:
                playSportSound(judo.getTag().toString());
                break;

            case R.id.karate:
                playSportSound(karate.getTag().toString());
                break;

            case R.id.aikido:
                playSportSound(aikido.getTag().toString());
                break;

            case R.id.taekwondo:
                playSportSound(taekwondo.getTag().toString());
                break;
        }
    }

    private void playSportSound(String sport) {
        MediaPlayer sportPlayer = MediaPlayer.create(this, getResources().getIdentifier(sport, "raw", getPackageName()));
            // passing name of audio file, containing folder, containgin package to getResources()...
        sportPlayer.start();
    }
}